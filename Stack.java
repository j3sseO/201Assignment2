public class Stack {

	Node head;

	/*
		Consructor method.
	*/
	public Stack() {
		head = null;
	}

	/*
	 	Add item x to front of the list.
	*/
	public void push(String x) {
		Node newNode = new Node(x);
		if (head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	/*
		Remove an item from the front of the list.
	*/
	public String pop() {
		if (head == null) {
			return "";
		}
		String value = head.value;
		head = head.next;
		return value;
	}

	/*
		Look at first item of the list and return its value.
	*/
	public String peek() {
		if (head == null) {
			return null;
		}
		String value = head.value;
		return value;
	}

	/*
		Returns boolean true if head node is null; false otherwise.
	*/
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	/*
		Returns as an int the number of commands in the stack.
	*/
	public int length() {
		int counter = 0;
		Node current = head;
		while (current != null) {
			counter++;
			current = current.next;
		}
		return counter;
	}

	/*
		Prints the contents of the stack to standard output.
	*/
	public void dump() {
		Node current = head;
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
		System.out.println();
	}
}