package Arrays;

import java.util.Scanner;

public class EvenOddArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number <1) {
			System.out.print("error : number should be natural number");
			return ;
		}
		int size = number /2 +1;
		int even[] = new int[size];
		int odd[] = new int[size];
		int evenIndex = 0;
		int oddIndex = 0;
		for(int i=1;i<=number;i++) {
			if(i%2==0) {
				even[evenIndex++]= i;
			}else {
				odd[oddIndex++]=i;
			}
		}
		for(int i=0;i<even.length&& even[i]!=0;i++) {
			System.out.print(even[i]+" ");
		}
		System.out.println();
		for(int i=0;i<odd.length&& odd[i]!=0;i++) {
			System.out.print(odd[i]+" ");
		}
	}

}
