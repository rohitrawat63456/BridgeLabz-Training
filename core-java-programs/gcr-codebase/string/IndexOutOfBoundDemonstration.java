package string;

import java.util.Scanner;

public class IndexOutOfBoundDemonstration {
	public static char exceptionMethod(String str) {
		return str.charAt(str.length());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		try {
			char lastChar = exceptionMethod(str);
			System.out.print(lastChar);
		} catch (Exception e) {
			System.out.print("Exception " + e);
		}
		sc.close();
	}

}
