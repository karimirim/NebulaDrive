public class Main {
    public static void main(String[] args) {
        TreeBuilder builder = new TreeBuilder();
        Node root = builder.buildSample(); // root = USER

        TreePrinter printer = new TreePrinter();
        System.out.println("=== Printer (pretty) ===");
        printer.print(root);

        System.out.println("\n=== DFS Print (depth) ===");
        TreeTraversal tv = new TreeTraversal();
        tv.dfsPrint(root);

        System.out.println("\n=== BFS Print (depth) ===");
        tv.bfsPrint(root);

        System.out.println("\n=== Iterative DFS (stack) ===");
        tv.dfsIterative(root);

        System.out.println("\n=== Searching Demo ===");
        Searching s = new Searching();
        Node found = s.dfs(root, "photo.png");
        System.out.println(found != null ? "Found (DFS): " + found : "Not found (DFS)");
        found = s.bfs(root, "Main.java");
        System.out.println(found != null ? "Found (BFS): " + found : "Not found (BFS)");

        System.out.println("\n=== Sorting Demo (Documents by NAME) ===");
        Node docs = s.dfs(root, "Documents");
        if (docs != null) {
            Sorting sorter = new Sorting();
            sorter.sortChildrenAscending(docs, Sorting.Mode.NAME);
            printer.print(root);
        }

        System.out.println("\n=== Add by path demo ===");
        TreeBuilder tb = new TreeBuilder();
        Node extra = new Node("newfile.txt", "2025-12-09", Node.Type.FILE, 1);
        boolean ok = tb.addByPath(root, "/Local Disk C/Documents", extra);
        System.out.println("Added to /Local Disk C/Documents ? " + ok);
        printer.print(root);
    }
}
