public class MyLinkedList<T> {
    private class NodeLL {
        T data;
        NodeLL next;
        NodeLL(T data) { this.data = data; }
    }

    private NodeLL head;
    private NodeLL tail;
    private int size = 0;
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    public void add(T data) {
        NodeLL node = new NodeLL(data);
        if (head == null) head = tail = node;
        else { tail.next = node; tail = node; }
        size++;
    }

    public T get(int index) {
        checkIndex(index);
        NodeLL cur = head;
        for (int i = 0; i < index; i++) cur = cur.next;
        return cur.data;
    }

    public void set(int index, T data) {
        checkIndex(index);
        NodeLL cur = head;
        for (int i = 0; i < index; i++) cur = cur.next;
        cur.data = data;
    }

    public void remove(int index) {
        checkIndex(index);
        if (index == 0) { removeFirst(); return; }
        NodeLL prev = head;
        for (int i = 0; i < index - 1; i++) prev = prev.next;
        NodeLL toRemove = prev.next;
        prev.next = toRemove.next;
        if (toRemove == tail) tail = prev;
        size--;
    }

    public void removeFirst() {
        if (head == null) return;
        head = head.next;
        if (head == null) tail = null;
        size--;
    }

    public void removeLast() {
        if (head == null) return;
        if (head == tail) { head = tail = null; size = 0; return; }
        NodeLL cur = head;
        while (cur.next != tail) cur = cur.next;
        cur.next = null;
        tail = cur;
        size--;
    }

    private void checkIndex(int idx) {
        if (idx < 0 || idx >= size) throw new IndexOutOfBoundsException("Index: " + idx);
    }
}
