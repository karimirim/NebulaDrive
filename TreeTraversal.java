public class TreeTraversal {

    public void dfsPrint(Node root) { dfsRec(root, 0); }

    private void dfsRec(Node node, int depth) {
        if (node == null) return;
        String indent = repeat("  ", depth);
        System.out.println(indent + node.getName());
        if (node.getChildren() == null) return;
        for (int i = 0; i < node.getChildren().size(); i++) {
            dfsRec(node.getChildren().get(i), depth + 1);
        }
    }

    public void bfsPrint(Node root) {
        if (root == null) return;

        MyQueue<Node> q = new MyQueue<>();
        MyQueue<Integer> lvl = new MyQueue<>();

        q.enqueue(root);
        lvl.enqueue(0);

        while (!q.isEmpty()) {
            Node cur = q.dequeue();
            int d = lvl.dequeue();

            System.out.println(repeat("  ", d) + cur.getName());

            if (cur.getChildren() != null) {
                for (int i = 0; i < cur.getChildren().size(); i++) {
                    q.enqueue(cur.getChildren().get(i));
                    lvl.enqueue(d + 1);
                }
            }
        }
    }

    // iterative DFS using MyStack
    public void dfsIterative(Node root) {
        if (root == null) return;
        MyStack<Node> stack = new MyStack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            System.out.println(cur.getName());
            if (cur.getChildren() != null) {
                for (int i = cur.getChildren().size() - 1; i >= 0; i--) {
                    stack.push(cur.getChildren().get(i));
                }
            }
        }
    }

    private String repeat(String s, int n) {
        String r = "";
        for (int i = 0; i < n; i++) r += s;
        return r;
    }
}