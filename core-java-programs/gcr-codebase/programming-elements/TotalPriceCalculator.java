package programmingElements;
import java.util.Scanner;
public class TotalPriceCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double unitPrice = sc.nextDouble();
		int quantity  = sc.nextInt();
		System.out.println("Total price is "+unitPrice*quantity);
		sc.close();
	}

}
