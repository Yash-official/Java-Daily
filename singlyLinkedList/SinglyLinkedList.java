public class SinglyLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	private int length;

	public SinglyLinkedList() {
		this.head = this.tail = null;
		this.length = 0;
	}

	public void enQueue(T val) {
		Node<T> node = new Node<>(val);
		if (this.head == null) {
			this.head = this.tail = node;
			this.length++;
			return;
		}
		tail.setNext(node);
		this.tail = node;
		this.length++;
	}

	public Node<T> deQueue() {
		if (this.tail == null) {
			System.out.println("The List is EMPTY");
			return null;
		}
		if (length == 1) {
			this.head = null;
			this.length--;
			return null;
		}
		Node<T> curr = this.head;
		this.head = head.getNext();
		this.length--;
		return curr;
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
		System.out.println();
	}
}
