package java_01;

import java.util.Scanner;

public class ForWhile01 {

	public static void main(String[] args) {

		// (예제) 1부터 10까지의 합을 For문으로
//
//		int forTotal = 0;
//
//		for (int i=1; i<=10; i++) {
//			forTotal = forTotal + i;
//			// total += i;
//
//			 System.out.println(i + " :: " + forTotal);
//		}
//
//		System.out.println("for total ==== " + forTotal);



		// (예제) 1부터 100까지의 합을 While문으로

//		int w = 1;
//		int whileTotal = 0;
//
//		while (w <= 100) {
//			whileTotal = whileTotal + w;
//			// whileTotal += w;			
//			w++;
//
//			// System.out.println(w + " :: " + whileTotal);
//		}
//
//		System.out.println("while total ==== " + whileTotal);
//		System.out.println();
		
		
		// (for) 1~100까지의 정수 중 6의 배수 출력
//		for(int i=1;i<=100;i++) {
//			if (i%6==0) {
//				System.out.println(i);
//			}
//		}
		
		
		// (while) 1~100까지의 정수 중 6의 배수 출력
//		int w = 0;
//		while(w<=100) {
//			w++;
//			if(w%6==0) {
//				System.out.println(w);
//			}
//		}
		
		// (for) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력
//		for(int i=0;i<=200;i++) {
//			if(i%6==0 && i%12!=0) {
//				System.out.println(i);
//			}
//		}
//		
//		
//		// (while) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력
//		int w=0;
//		while(w<=200) {
//			w++;
//			if(w%6==0 && w%12!=0) {
//				System.out.println(w);
//			}
//		}
//	
	
		//1~60000까지의 정수 중 100의 배수는 몇개?
		int num = 0;
		for(int i=1;i<=60000;i++) {
			if(i%100 == 0) {
				num++;
			}
		}
		System.out.println(num);
		
		int w=0;
		int num1=0;
		while(w<=60000) {
			w++;
			if(w%100 == 0) {
				num1++;
			}
		}
		System.out.println(num1);
//		
	}

}