package programmingElements;

public class DiscountCalculate {

	public static void main(String[] args) {
		int fee = 125000;
		int discountPercent = 10;
		double discount = fee*(discountPercent/100.0);
		System.out.printf("The discount amount is INR %.2f%% and final discounted fee is %.2f%%",discount,(fee-discount));
	}

}
