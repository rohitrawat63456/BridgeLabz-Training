package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SecondLargestReview {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int arr[] = new int[n];
		boolean b = true;
		while (b) {
			int c = 0;
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				if (x < 0) {
					break;
				}
				c++;
				arr[i] = x;
			}
			if (c == 5) {
				b = false;
			} else {
				System.out.println("Re enter the numbers");
			}
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int m = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > m && arr[i] != max) {
				m = arr[i];
			}
		}
		System.out.print(m == Integer.MIN_VALUE ? "no second element" :"Second Largest number is "+ m);

	}

}
