public class Node {
    public enum Type { USER, DISK, FOLDER, FILE }

    private String name;
    private String dateModified;
    private Type type;
    private int sizeKB; 
    private MyLinkedList<Node> children;

    // nambah parent
    private Node parent;

    public Node(String name, String dateModified, Type type, int sizeKB) {
        this.name = name;
        this.dateModified = dateModified;
        this.type = type;
        this.sizeKB = (type == Type.FILE) ? sizeKB : 0;

        if (type == Type.USER || type == Type.DISK || type == Type.FOLDER) {
            this.children = new MyLinkedList<>();
        } else {
            this.children = null;
        }
    }

    public Node(String name, String dateModified, Type type) {
        this(name, dateModified, type, 0);
    }

    // getters / setters
    public String getName() { return name; }
    public String getDateModified() { return dateModified; }
    public Type getType() { return type; }
    public int getSizeKB() { return sizeKB; }
    public MyLinkedList<Node> getChildren() { return children; }

    public Node getParent() { return parent; }
    public void setParent(Node p) { this.parent = p; }

    public void setName(String name) { this.name = name; }
    public void setDateModified(String dateModified) { this.dateModified = dateModified; }
    public void setSizeKB(int sizeKB) { 
        if (this.type == Type.FILE) this.sizeKB = sizeKB;
    }

    // child ops
    public void addChild(Node child) {
        if (children == null)
            throw new IllegalStateException("Cannot add child to non-folder node");

        children.add(child);
        child.setParent(this); // penting banget
    }

    public boolean removeChildByName(String childName) {
        if (children == null) return false;

        for (int i = 0; i < children.size(); i++) {
            Node n = children.get(i);
            if (n.getName().equals(childName)) {
                children.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        switch (type) {
            case FILE: return name + " (" + sizeKB + "KB)";
            case FOLDER: return "[Folder] " + name;
            case DISK: return "[Disk] " + name;
            default: return "[User] " + name;
        }
    }
}
