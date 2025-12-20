package Arrays;

import java.util.Scanner;

public class AgeCheckForVote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int studentsAge[] = new int[10];
		for (int i = 0; i < 10; i++) {
			studentsAge[i] = sc.nextInt();
		}
		for (int i = 0; i < 9; i++) {
			int age = studentsAge[i];
			if (age < 0) {
				System.out.println("invalid age");
			} else if (age < 18) {
				System.out.println("The student with age " + age + "cannot vote");
			} else {
				System.out.println("The student with age " + age + " can vote");
			}
		}
		sc.close();

	}

}
