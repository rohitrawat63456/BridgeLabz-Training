package programmingElements;
import java.util.Scanner;
public class TriangleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		double areaInCM = 1.0/2 * base * height ;
		double areaInInch = 1.0/2 * base/2.54 * height/2.54;
		System.out.printf("Area in cm square is %.2f \n",areaInCM);
		System.out.printf("Area in inch square is %.2f",areaInInch);
		sc.close();
	}

}
