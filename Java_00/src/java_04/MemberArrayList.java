package java_04;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberArrayList {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/**
		 * [ 요구사항 ]
		 * 
		 *  1. 회원명을 입력받아 ArrayList를 생성하시오.
		 *  2. "그만" 이라고 입력하면 프로그램 종료
		 */
		ArrayList<String> memArr = createMember();
		printMember(memArr);
	}

	// 다섯명의 회원명을 입력받아 ArrayList 생성할 method
	public static ArrayList<String> createMember() {
		ArrayList<String> memArr = new ArrayList<String>();
		
		String str1 = "그만";
		while(true){		 
			System.out.println("회원명을 입력하세요 : ");
			String memberName = sc.next();
			
			
			if(memberName.equals(str1)) {
				break;
			}else {
				memArr.add(memberName);
			}
		}
		
		return memArr;
		
	}

	// 생성된 회원정보를 출력하는 method
	public static void printMember(ArrayList<String> args) {
		
		for(int i=0;i<args.size();i++) {
		
		System.out.println("회원 "+(i+1)+" 이름 : "+args.get(i));
		
	}
	
}
}