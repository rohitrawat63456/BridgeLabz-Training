package programmingElements;

public class PenDivide {

	public static void main(String[] args) {
		int pen = 14;
		int students = 3;
		int remainingPens = pen%students;
		int penStudentHave = pen/students;
		System.out.println("Pens Remaining "+remainingPens);
		System.out.println("Pens each Studetn have "+penStudentHave);
	}

}
