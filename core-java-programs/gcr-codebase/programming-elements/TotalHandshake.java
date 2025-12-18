package programmingElements;
import java.util.Scanner;
public class TotalHandshake {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfStudent = sc.nextInt();
		int maxHandshake = (numberOfStudent*(numberOfStudent-1))/2;
		System.out.println("Possible Handshakes are "+maxHandshake);
		sc.close();
	}

}
