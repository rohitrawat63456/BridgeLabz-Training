package string;

import java.util.Scanner;

public class NullPointerDemonstration {

	public static int exceptionMethod(String str) {
		return str.length();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = null;
		try {
			int len = exceptionMethod(str);
			System.out.print("length of string is : " + len);

		} catch (Exception e) {
			System.out.print("String is assigned null \nHence Null Pointer Exception");
		}
		sc.close();
	}

}
