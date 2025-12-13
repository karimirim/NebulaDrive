public class TreeTraversal {

    public void dfsPrint(Node root) {
        dfsRec(root, 0);
    }

    private void dfsRec(Node node, int depth) {
        if (node == null)
            return;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++)
            sb.append("  ");
        String indent = sb.toString();

        String icon = node.getType() == Node.Type.FOLDER ? "> " : "- ";

        System.out.println(indent + icon + node.getName());

        if (node.getChildren() == null || node.getChildren().size() == 0)
            return;

        for (int i = 0; i < node.getChildren().size(); i++) {
            dfsRec(node.getChildren().get(i), depth + 1);
        }
    }

    public void bfsPrint(Node root) {
        if (root == null)
            return;

        MyQueue<Node> q = new MyQueue<>();
        MyQueue<Integer> lvl = new MyQueue<>();

        q.enqueue(root);
        lvl.enqueue(0);

        while (!q.isEmpty()) {
            Node cur = q.dequeue();
            int d = lvl.dequeue();

            // indent
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < d; i++)
                sb.append("  ");
            String indent = sb.toString();

            // icon
            String icon = cur.getType() == Node.Type.FOLDER ? "> " : "- ";

            // print
            System.out.println(indent + icon + cur.getName());

            // enqueue anak-anak
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
        if (root == null)
            return;

        MyStack<Node> stack = new MyStack<>();
        MyStack<Integer> depthStack = new MyStack<>();

        stack.push(root);
        depthStack.push(0);

        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            int depth = depthStack.pop();

            // indent
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < depth; i++)
                sb.append("  ");
            String indent = sb.toString();

            // icon
            String icon = (cur.getType() == Node.Type.FOLDER) ? "> " : "- ";

            // print
            System.out.println(indent + icon + cur.getName());

            // push children (harus dari belakang biar urutan sama DFS rec)
            if (cur.getChildren() != null) {
                int n = cur.getChildren().size();
                for (int i = n - 1; i >= 0; i--) {
                    stack.push(cur.getChildren().get(i));
                    depthStack.push(depth + 1);
                }
            }
        }
    }

    private String repeat(String s, int n) {
        String r = "";
        for (int i = 0; i < n; i++)
            r += s;
        return r;
    }
}
