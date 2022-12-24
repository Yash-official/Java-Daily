public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    public DoublyLinkedList() {
        this.head = this.tail = null;
        this.length = 0;
    }

    public void add(T val) {
        Node<T> node = new Node(val);
        if (length == 0) {
            this.head = this.tail = node;
            length++;
            return;
        }
        node.setPrev(this.tail);
        this.tail.setNext(node);
        length++;
        this.tail = node;
    }

    public Node<T> deQueue() {
        if (length == 0) {
            System.out.println("The List is Empty");
        }
        Node<T> node = this.head;
        this.head = this.head.getNext();
        length--;
        return node;
    }

    public boolean find(T val) {
        Node<T> curr = this.head;
        for (int i = 0; i < this.length; i++) {
            if (curr.value == val) {
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }

    public Node<T> remove(T val) {
        Node<T> curr = this.head;
        for (int i = 0; i < this.length; i++) {
            if (curr.value == val) {
                System.out.println("Found");
                if (curr.getNext() != null) {
                    curr.getPrev().setNext(curr.getNext());
                    curr.getNext().setPrev(curr.getPrev());
                } else {
                    curr.getPrev().setNext(null);
                }
                length--;
                return curr;
            }
            curr = curr.getNext();
        }
        return null;
    }

    public void printList() {
        if (this.length == 0) {
            System.out.println("No Items in List");
        }
        System.out.print("head");
        Node<T> curr = this.head;
        for (int i = 0; i < this.length; i++) {
            System.out.print(" --> " + curr.value);
            curr = curr.getNext();
        }
        System.out.print(" <-- tail");
        System.out.println();
    }
}