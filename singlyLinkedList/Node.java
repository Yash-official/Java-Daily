class Node<T> {
	private Node<T> prev;
	private Node<T> next;
	T value;

	public Node(T val) {
		this.value = val;
	}

	public Node<T> getPrev() {
		return prev;
	}

	public Node<T> getNext() {
		return this.next;
	}

	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

	public void setNext(Node<T> node) {
		this.next = node;
	}
}
