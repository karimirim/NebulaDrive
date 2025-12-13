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

        Node found = s.dfs(root, "as.pptx");
        if (found != null) {
            System.out.println("Found (DFS):");
            printer.printSinglePath(found);
            System.out.println();
        } else {
            System.out.println("Not Found (DFS):");
            System.out.println("No items match your search");
            System.out.println();
        }

        found = s.bfs(root, "an.psd");
        if (found != null) {
            System.out.println("Found (BFS):");
            printer.printSinglePath(found);
            System.out.println();
        } else {
            System.out.println("Not Found (BFS):");
            System.out.println("No items match your search");
        }

        System.out.println("\n=== Sorting Demo (Folder + File) ===");
        Node sem3 = s.dfs(root, "Local Disk C");
        if (sem3 != null) {
            Sorting sorter = new Sorting();
            sorter.sortChildrenAscending(sem3, Sorting.Mode.NAME);
            printer.printChildrenOnly(sem3);
        }
    }
}
