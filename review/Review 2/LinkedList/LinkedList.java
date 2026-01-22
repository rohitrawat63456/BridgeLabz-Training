package LinkedList;

public class LinkedList {
	static ListNode head = null;
	static ListNode tail = null;

	public static void addNodeLast(ListNode node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}

	public static void addNodeFirst(ListNode node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	public static void addAtMiddle(ListNode node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			ListNode slow = head;
			ListNode fast = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;

			}
			node.next = slow.next;
			slow.next = node;

		}
	}

	public static void display() {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.value + "--> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.addNodeFirst(new ListNode(3));
		l.addNodeLast(new ListNode(4));
		l.addNodeFirst(new ListNode(8));
		l.addAtMiddle(new ListNode(5));
		l.addNodeLast(new ListNode(9));
		l.display();

	}

}
