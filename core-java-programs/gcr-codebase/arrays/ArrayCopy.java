package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class ArrayCopy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int matrix[][] = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j]= sc.nextInt();
			}
		}
		int[] arr = new int[row*col];
		int index=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[index++]= matrix[i][j];
			}
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
	

}
