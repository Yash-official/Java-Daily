class Node<T> {
	private Node<T> next;
	T value;

	public Node(T val) {
		this.value = val;
	}

	public Node<T> getNext() {
		return this.next;
	}

	public void setNext(Node<T> node) {
		this.next = node;
	}
}
