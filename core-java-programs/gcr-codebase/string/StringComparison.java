package string;

import java.util.*;

public class StringComparison {
	public static boolean isEqual(String str1, String str2) {
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.print(isEqual(str1, str2) && str1.equals(str2));
		sc.close();
	}

}
