package methods;

import java.util.Scanner;

public class SimpleInterest {
	public static double calculateSI(double principal, double time, double rate) {
		double si = (principal * rate * time) / 100;
		return si;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p = sc.nextDouble();
		double t = sc.nextDouble();
		double r = sc.nextDouble();
		System.out.printf("Simple Interest is : %.2f", calculateSI(p, r, t));
		sc.close();
	}

}
