package Arrays;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		for (int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
		}
		for (int i : num) {
			if (i == 0) {
				System.out.println("Positive number");
			} else if (i < 0) {
				System.out.println("neagitve number");
			}
		}
		sc.close();
	}

}
