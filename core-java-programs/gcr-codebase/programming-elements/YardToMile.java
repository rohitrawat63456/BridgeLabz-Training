package programmingElements;
import java.util.Scanner;
public class YardToMile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double distanceInFeet  = sc.nextDouble();
		double distanceInYard = distanceInFeet/3;
		double distanceInMile = distanceInYard/1760;
		System.out.printf("Distance in yard is %.2f and %.2f in mile",distanceInYard,distanceInMile);
		sc.close();
	}

}
