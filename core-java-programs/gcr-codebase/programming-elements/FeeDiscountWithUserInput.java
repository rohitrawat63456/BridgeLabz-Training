package programmingElements;
import java.util.Scanner;

public class FeeDiscountWithUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fee = sc.nextInt();
		int discountPercent = sc.nextInt();
		double discount = fee * discountPercent/100.0;
		System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f ",discount,fee-discount);
		sc.close();
	}

}
