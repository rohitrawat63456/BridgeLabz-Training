package programmingElements;
import java.util.*;
public class BasicCalculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int sub = input2 -input1;
		int add = input1 +  input2;
		int mul = input1*input2;
		int div = input1/input2;
		System.out.printf("The addition,subtraction,multiplication and divison value of 2 numbers %d and %d is %d,%d,%d, and %d", input1,input2,sub,add,mul,div);
		sc.close();
	} 
}
