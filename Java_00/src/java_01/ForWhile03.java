package java_01;

import java.util.Scanner;

public class ForWhile03 {

	public static void main(String[] args) {

		// 정수를 입력 받아 구구단을 출력해 보세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 단수의 구구단을 출력할까요 : ");
		
		int dan = sc.nextInt();
		
		
		// while 문 활용
		if(dan>=1&&dan<=9) {
			System.out.println("====== [ while문 ] " + dan + " 단 ==========");
			int w=1;
			while(w<=9) {
				System.out.println(dan+" * "+w+" = "+ dan*w);
				w++;
			}
		}else {
			System.out.println("1~9단 까지만 입력 가능합니다");
		}
		
		
		
		// for 문 활용
		if(dan>=1&&dan<=9) {
			System.out.println("====== [ for문 ] " + dan + " 단 ==========");
			for(int i=1;i<=9;i++) {
				System.out.println(dan+" * "+i+" = "+ dan*i);
			}
		}else {
			System.out.println("1~9단 까지만 입력 가능합니다");
		}
		
		
		
		sc.close();
		
	}

}