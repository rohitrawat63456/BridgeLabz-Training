package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Largest number is : " + arr[9]);
		System.out.println("Second Largest number is : " + arr[8]);
		sc.close();
	}

}
