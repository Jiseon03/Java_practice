package java_git_test;

import java.util.Scanner;

public class 최대최소 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		int max = -1000000;
		int min = 1000000;
		for(int i=0;i<num;i++) {
			int input = sc.nextInt();
			arr[i] = input;
			if(arr[i]>max) {
				max = arr[i];
			}
			
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.print(min+" ");
		System.out.print(max);
	}

}
