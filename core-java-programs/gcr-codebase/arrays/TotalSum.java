package Arrays;
import java.util.Scanner;
public class TotalSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0;i<10;i++) {
			int input = sc.nextInt();
			if(input<=0) {
				break;
			}else {
				arr[i] = input;
			}
		}
		int index =0 ;
		int sum=0;
		while(index<10 && arr[index]>0) {
			System.out.print(arr[index]+" ");
			sum += arr[index++];
		}
		System.out.print("\nSum is : "+sum);
		sc.close();
	}

}
