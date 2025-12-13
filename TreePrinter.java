public class TreePrinter {

    private static final int NAME_W = 40;
    private static final int TYPE_W = 10;
    private static final int SIZE_W = 12;
    private static final int MOD_W = 20;

    public void print(Node root) {
        printHeader();
        printSeparator();
        printNode(root, "", true);
    }

    // khusus untuk hasil pencarian (1 file dengan path lengkap)
    public void printSinglePath(Node node) {
        if (node == null)
            return;

        System.out.println("Path: " + buildPath(node));
        System.out.println("Detail:");
        printHeader();
        printSeparator();
        printNode(node, "", true);
    }

    private String buildPath(Node node) {
        StringBuilder sb = new StringBuilder();
        Node cur = node;

        while (cur != null) {
            sb.insert(0, "/" + cur.getName());
            cur = cur.getParent();
        }
        return sb.toString();
    }

    private void printHeader() {
        printRow("Name", "Type", "Size", "Modified");
    }

    private void printSeparator() {
        int total = NAME_W + TYPE_W + SIZE_W + MOD_W + 9;
        for (int i = 0; i < total; i++)
            System.out.print('-');
        System.out.println();
    }

    private void printNode(Node node, String prefix, boolean isLast) {
        if (node == null)
            return;

        String marker = prefix.isEmpty() ? "" : (isLast ? "└── " : "├── ");

        String name = prefix + marker + safe(node.getName());
        String type = (node.getType() == null) ? "" : node.getType().name();
        String size = "";
        if (node.getType() == Node.Type.FILE) {
            size = humanReadable(node.getSizeKB());
        }
        String modified = (node.getDateModified() == null) ? "" : String.valueOf(node.getDateModified());

        printRow(name, type, size, modified);

        MyLinkedList<Node> children = node.getChildren();
        if (children == null || children.size() == 0)
            return;

        for (int i = 0; i < children.size(); i++) {
            boolean lastChild = (i == children.size() - 1);
            Node child = children.get(i);

            String childPrefix = prefix
                    + (prefix.isEmpty() ? "" : (isLast ? "    " : "│   "));

            printNode(child, childPrefix, lastChild);
        }
    }

    private void printRow(String n, String t, String s, String m) {
        System.out.printf(
                "%-" + NAME_W + "s | %-" + TYPE_W + "s | %-" + SIZE_W + "s | %-" + MOD_W + "s%n",
                n, t, s, m);
    }

    private String humanReadable(long kb) {
        if (kb <= 0)
            return "0B";
        double bytes = kb * 1024.0;
        String[] u = { "B", "KB", "MB", "GB", "TB" };
        int i = 0;
        while (bytes >= 1024 && i < 4) {
            bytes /= 1024;
            i++;
        }
        return String.format("%.2f %s", bytes, u[i]);
    }

    private String safe(String s) {
        return (s == null) ? "" : s;
    }

    public void printChildrenOnly(Node parent) {
        if (parent == null)
            return;

        MyLinkedList<Node> children = parent.getChildren();
        if (children == null || children.size() == 0) {
            System.out.println("(No children)");
            return;
        }

        printHeader();
        printSeparator();

        for (int i = 0; i < children.size(); i++) {
            Node child = children.get(i);

            String name = safe(child.getName());
            String type = (child.getType() == null) ? "" : child.getType().name();
            String size = "";
            if (child.getType() == Node.Type.FILE) {
                size = humanReadable(child.getSizeKB());
            }
            String modified = (child.getDateModified() == null) ? "" : String.valueOf(child.getDateModified());

            printRow(name, type, size, modified);
        }
    }

}
