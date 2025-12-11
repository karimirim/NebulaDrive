public class MyQueue<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public void enqueue(T value) { list.add(value); }

    public T dequeue() {
        if (isEmpty()) return null;
        T v = list.get(0);
        list.removeFirst();
        return v;
    }

    public T peek() {
        if (isEmpty()) return null;
        return list.get(0);
    }

    public boolean isEmpty() { return list.size() == 0; }
    public int size() { return list.size(); }
}
