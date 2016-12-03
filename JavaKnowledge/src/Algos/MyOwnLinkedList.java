package Algos;

public class MyOwnLinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void insertSorted(Node newNode) {
		Node currentNode;

		/* special case for head node */
		if (head == null || head.data >= newNode.data) {
			newNode.next = head;
			head = newNode;
		} else {
			// case for searching and inserting new node into already created
			// list
			currentNode = head;

			while (currentNode.next != null && currentNode.next.data < newNode.data) {
				currentNode = currentNode.next;
			}
			newNode.next = currentNode.next;
			currentNode.next = newNode;

		}
	}

	public Node newNode(int data) {
		Node node = new Node(data);
		return node;
	}

	/* Function to print linked list */
	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		MyOwnLinkedList list = new MyOwnLinkedList();
		Node node;
		node = list.newNode(5);
		list.insertSorted(node);

		node = list.newNode(2);
		list.insertSorted(node);

		node = list.newNode(4);
		list.insertSorted(node);

		System.out.println("list is: ");
		list.printList();
	}

}
