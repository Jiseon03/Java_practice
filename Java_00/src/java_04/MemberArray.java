package java_04;

import java.util.Scanner;

public class MemberArray {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/**
		 * [ 요구사항 ]
		 * 
		 *  1. 다섯명의 회원명을 입력받아 String 배열을 생성하시오.
		 *  
		 */
		
		String[] memArr = createMember();
		printMember(memArr);

	}

	// 다섯명의 회원명을 입력받아 String 배열을 생성할 method
	public static String[] createMember() {
		String[] memArr = new String[5];
		
		for(int i=0;i<memArr.length;i++) {
			System.out.println((i+1)+"번째 회원명을 입력하세요 : ");
			String memberName = sc.next();
			memArr[i] = memberName;
		}
		
		return memArr;
	}

	// 생성된 회원정보를 출력하는 method
	public static void printMember(String[] args) {
		
			for(int i=0;i<args.length;i++) {
			
			System.out.println("회원 "+(i+1)+" 이름 : "+args[i]);
			
		}
		
	}

}