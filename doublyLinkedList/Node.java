public class Node<T> {
    private Node<T> next;
    private Node<T> prev;
    T value;

    public Node(T val) {
        this.value = val;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public Node<T> getPrev() {
        return this.prev;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

}