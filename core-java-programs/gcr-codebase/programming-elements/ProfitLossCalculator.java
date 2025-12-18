package programmingElements;

public class ProfitLossCalculator {

	public static void main(String[] args) {
		int costPrice = 129;
		int sellingPrice = 191;
		int profitInNumber = sellingPrice-costPrice;
		double profitPercent = (profitInNumber*1.0)/costPrice *100;
		System.out.printf("The cost price in INR is %d and the selling price in INR is %d \nThe profit in number is %d and the profit in percent is %.2f%%",costPrice,sellingPrice,profitInNumber,profitPercent);
		
	}

}
