package ProblemSet;

import java.util.Arrays;

public class CompareVersionNumber {
	public static int compareVersion(String version1, String version2) {
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
//		System.out.print(Arrays.toString(v1));
//		System.out.print(Arrays.toString(v2));
		int i = 0, j = 0;
		while (i < v1.length && j < v2.length) {
			int n1 = i == v1.length ? 0 : Integer.parseInt(v1[i++]);
			int n2 = j == v2.length ? 0 : Integer.parseInt(v2[j++]);
			if (n1 < n2) {
				return -1;
			} else if (n1 > n2) {
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.print(compareVersion("1.0", "1.0.0.0"));
	}

}
