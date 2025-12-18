package programmingElements;
import java.util.Scanner;
public class HeightConverter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double heightInCM = sc.nextDouble();
		double heightInInch = heightInCM/2.54;
		double heightInFoot = heightInInch/12;
		System.out.printf("Your Height in cm is %.2f while in feet is %.2f and in inches is %.2f",heightInCM,heightInFoot,heightInInch);
		sc.close();
	}
}
