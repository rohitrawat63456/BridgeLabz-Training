package Arrays;

import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary[] = new double[10];
		double serviceYear[] = new double[10];
		double newSalary[] = new double[10];
		double bonus[] = new double[10];
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter your salary ");
			salary[i] = sc.nextDouble();
			System.out.print("Enter your service year :  ");
			serviceYear[i] = sc.nextDouble();
		}
		for (int i = 0; i < 10; i++) {
			double newBonus = 0;
			if (serviceYear[i] > 5) {
				newBonus = salary[i] * 0.05;
			} else {
				newBonus = salary[i] * 0.02;
			}
			bonus[i] = newBonus;
			newSalary[i] = salary[i] + newBonus;
		}
		for (int i = 0; i < 10; i++) {
			System.out
					.println("Total Bonus of " + i + " employee is " + bonus[i] + " and new Salary is " + newSalary[i]);
		}
	}

}
