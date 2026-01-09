package DataStructureAndAlgorithm;

class Node {
	int rollNumber;
	String name;
	int age;
	char grade;
	Node next;

	Node(int rollNumber, String name, int age, char grade) {
		this.rollNumber = rollNumber;
		this.age = age;
		this.name = name;
		this.grade = grade;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Student name : " + this.name + "\n" + "Age : " + this.age + "\n" + "Roll Number : " + this.rollNumber
				+ "\n" + "Grade : " + this.grade + " \n";
	}
}

public class StudentRecordManagement {
	protected static Node head = null;
	protected static Node tail = null;
	protected static int size = 0;

	public static void addStudentAtEnd(Node newStudent) {
		if (tail == null) {
			head = newStudent;
			tail = newStudent;
		} else {
			tail.next = newStudent;
			tail = newStudent;
		}
		size++;
	}

	public static void addStudentAtStart(Node newStudent) {
		if (head == null) {
			head = newStudent;
			tail = newStudent;
		} else {
			newStudent.next = head;
			head = newStudent;
		}
		size++;
	}

	public static boolean searchStudent(int rollNumber) {
		Node temp = head;
		while (temp != null) {
			if (temp.rollNumber == rollNumber)
				return true;
		}
		return false;
	}

	public static void addStudentAt(int position, Node newStudent) {
		if (position == 0) {
			addStudentAtStart(newStudent);
		} else if (position == size + 1) {
			addStudentAtEnd(newStudent);
		} else {
			Node temp = head;
			while (position - 1 != 0) {
				temp = temp.next;
				position--;
			}
			newStudent.next = temp.next;
			temp.next = newStudent;
			size++;
		}
	}

	public static void deleteStudent(int rollNumber) {
		if (searchStudent(rollNumber)) {
			Node prev = null;
			Node temp = head;
			while (temp != null && temp.rollNumber != rollNumber) {
				prev = temp;
				temp = temp.next;
			}
			if (prev == null) {
				if (tail == head) {
					tail = null;
				}
				head = head.next;

			} else {
				if (prev.next == tail) {
					prev.next = null;
					tail = prev;
				} else
					prev.next = prev.next.next;
			}
			size--;
		}
	}

	public static void display() {
		Node temp = head;
		if (head == null) {
			System.out.print("Nothing to display ");
		}
		while (temp != null) {
			System.out.println(temp);
			temp = temp.next;
		}
	}

	public static void upgradeGrade(int rollNumber, char grade) {
		Node temp = head;
		while (temp != null && temp.rollNumber != rollNumber) {
			temp = temp.next;
		}
		temp.grade = grade;
		System.out.println(temp.name + "'s grade updated succesfully ");
	}

	public static void main(String[] args) {
		Node s1 = new Node(1, "Rohit Rawat", 21, 'A');
		Node s2 = new Node(2, "Raj Bahadur", 22, 'B');
		Node s3 = new Node(3, "Nived Agrawal", 23, 'C');
		Node s4 = new Node(4, "Ronit ", 24, 'D');
		Node s5 = new Node(5, "Rahul", 25, 'E');

		addStudentAt(1, s1);
		addStudentAtEnd(s2);
		addStudentAt(3, s3);
		addStudentAtStart(s4);
		addStudentAtEnd(s5);

		display();

		deleteStudent(3);
		System.out.println("-----------------------------------");
		display();

		upgradeGrade(2, 'A');

		System.out.println("After grade upgrade \n ");
		System.out.println("-----------------------------------");
		display();

	}

}
