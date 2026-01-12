package ProblemSet;

public class Solution {
	public static int reverse(int num) {
		long n = num;
		boolean isNegative = num < 0 ? true : false;
		n = Math.abs(n);
		long reverse = 0;
		while (n > 0) {
			reverse = reverse * 10 + n % 10;
			n = n / 10;
		}
		if (isNegative) {
			reverse = 0 - reverse;
			return reverse < Integer.MIN_VALUE ? -1 : (int) reverse;
		} else {
			return reverse > Integer.MAX_VALUE ? -1 : (int) reverse;
		}

	}

	public static void main(String[] args) {
		System.out.print(reverse(-1236576887));
	}

}
