package java_01;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// -----------------------------------------------------
		// Scanner를 통해 1부터 5까지의 숫자를 입력 받아 영문으로 변환
		// 
		// [ 결과 예시 ] 1 은 one 입니다.
		// -----------------------------------------------------

		System.out.print("숫자를 입력해 주세요. (1부터 5까지만 가능) : ");
		int num = sc.nextInt();

		String engNum = "";

		switch (num) {
		case 1 :
			engNum = "one";
			break;
		case 2 :
			engNum = "two";
			break;
		case 3 :
			engNum = "three";
			break;
		case 4 :
			engNum = "four";
			break;
		case 5 :
			engNum = "five";
			break;
		default : //case를 설정하지 않은 값들은 모두 default로 빠짐.
			engNum = "변환 범위 X";
			break;
		}

		System.out.println(num + " 은(는) " + engNum + " 입니다.");
		System.out.println();



		// -----------------------------------------------------
		// Scanner를 통해 성별 정보를 입력 받아 남성 / 여성을 출력
		// 
		// 입력값은 대문자 또는 소문자 또는 기호(+, -)
		// -----------------------------------------------------

		System.out.println("성별을 입력하세요. (m / M / f / F / + / - )");
		System.out.print(" >> ");
		String gender = sc.next();
		switch (gender) {
		case "m","M","+" :
			System.out.println("남성입니다.");
			break;
		case "f","F","-" :
			System.out.println("여성입니다.");
			break;
		default : 
			System.out.println("올바른 기호를 입력해주세요.");
			break;
		}
		
		
		// -----------------------------------------------------
		// 1~12의 정수를 입력 받아 해당 월의 계절을 출력
		// 
		// 3, 4, 5 : 봄
		// 6, 7, 8 : 여름
		// 9, 10, 11 : 가을
		// 12, 1, 2 : 겨울
		// -----------------------------------------------------
		System.out.print("숫자를 입력해 주세요. (1부터 12까지만 가능) : ");
		int num1 = sc.nextInt();
		
		switch(num1) {
		case 3,4,5 :
			System.out.print("봄");
			break;
		case 6,7,8 :
			System.out.print("여름");
		case 9,10,11 :
			System.out.print("가을");
		case 12,1,2 :
			System.out.print("겨울");
		default :
			System.out.print("잘못입력");
		}
		

		sc.close();

	}

}