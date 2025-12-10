public class Searching {

    public Node dfs(Node root, String targetName) {
        if (root == null) return null;
        if (root.getName().equalsIgnoreCase(targetName)) return root;
        if (root.getChildren() == null) return null;

        for (int i = 0; i < root.getChildren().size(); i++) {
            Node found = dfs(root.getChildren().get(i), targetName);
            if (found != null) return found;
        }
        return null;
    }

    public Node bfs(Node root, String targetName) {
        if (root == null) return null;

        MyQueue<Node> q = new MyQueue<>();
        q.enqueue(root);

        while (!q.isEmpty()) {
            Node cur = q.dequeue();

            if (cur.getName().equalsIgnoreCase(targetName)) return cur;

            if (cur.getChildren() != null) {
                for (int i = 0; i < cur.getChildren().size(); i++) {
                    q.enqueue(cur.getChildren().get(i));
                }
            }
        }
        return null;
    }
}
