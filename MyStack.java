public class MyStack<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public void push(T value) { list.add(value); }

    public T pop() {
        if (isEmpty()) return null;
        T v = list.get(list.size() - 1);
        list.removeLast();
        return v;
    }

    public T peek() {
        if (isEmpty()) return null;
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() { return list.size() == 0; }
    public int size() { return list.size(); }
}
