package string;

import java.util.Scanner;

public class FindSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int startIndex = sc.nextInt();
		int endIndex = sc.nextInt();
		String sub = "";
		for (int i = startIndex; i < endIndex; i++) {
			sub += str.charAt(i);
		}
		System.out.print(sub.equals(str.substring(startIndex, endIndex)));
		sc.close();
	}

}
