package Arrays;

import java.util.Scanner;

public class DigitsFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] freq = new int[10];
		while (num > 0) {
			freq[num % 10] += 1;
			num = num / 10;
		}
		for (int i = 0; i < 10; i++) {
			if (freq[i] != 0) {
				System.out.println(i + " : " + freq[i]);
			}
		}
		sc.close();
	}

}
