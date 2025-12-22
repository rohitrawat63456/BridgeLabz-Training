package Arrays;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int digits = (int) Math.log10(num) + 1;
		int[] reverse = new int[digits];
		for (int i = 0; i < digits; i++) {
			reverse[i] = num % 10;
			num = num / 10;
		}
		int reverseNumber = 0;
		for (int i = 0; i < digits; i++) {
			reverseNumber = reverseNumber * 10 + reverse[i];
		}
		System.out.println(reverseNumber);
		sc.close();
	}

}
