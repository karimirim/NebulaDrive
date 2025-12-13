public class Sorting {

    public enum Mode { NAME, SIZE, DATE }

    public void sortChildrenAscending(Node folder, Mode mode) {
        sort(folder, mode, true);
    }

    public void sortChildrenDescending(Node folder, Mode mode) {
        sort(folder, mode, false);
    }

    private void sort(Node folder, Mode mode, boolean ascending) {
        if (folder.getChildren() == null) return;

        int n = folder.getChildren().size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                Node a = folder.getChildren().get(j);
                Node b = folder.getChildren().get(j + 1);

                int cmp = compare(a, b, mode);
                boolean needSwap = ascending ? (cmp > 0) : (cmp < 0);

                if (needSwap) {
                    folder.getChildren().set(j, b);
                    folder.getChildren().set(j + 1, a);
                }
            }
        }
    }

    private int compare(Node a, Node b, Mode mode) {
        switch (mode) {
            case SIZE:
                return Integer.compare(a.getSizeKB(), b.getSizeKB());

            case DATE:
                return a.getDateModified().compareToIgnoreCase(b.getDateModified());

            default:
                return a.getName().compareToIgnoreCase(b.getName());
        }
    }
}