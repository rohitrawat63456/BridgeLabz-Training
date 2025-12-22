package Arrays;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxFactor=10;
		int factors[] = new int[maxFactor];
		int number = sc.nextInt();
		for(int i=1,j=0;i<=number/2;i++) {
			if(number%i ==0) {
				factors[j++] = i;
			}
		}
		for(int i=0;i<factors.length&& factors[i]!=0;i++) {
			System.out.print(factors[i]+" ");
		}
		sc.close();
	}

}
