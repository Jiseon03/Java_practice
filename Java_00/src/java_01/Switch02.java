package java_01;
import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// -----------------------------------------------------
		// Scanner를 통해 1~12 사이의 정수를 입력 받아 해당 월의 마지막 일자를 출력
		// 
		// [ 출력 결과 예시 ] 6월의 마지막 날짜는 30일 입니다.
		// -----------------------------------------------------
		System.out.println("숫자를 입력해 주세요. (1부터 12까지만 가능) : ");
		int month = sc.nextInt();
		switch (month) {
		case 1,3,5,7,8,10,12:
			System.out.println(month+"월의 마지막 날짜는 31일 입니다.");
			break;
		case 4,6,9,11:
			System.out.println(month+"월의 마지막 날짜는 30일 입니다.");
			break;
		case 2:
			System.out.println(month+"월의 마지막 날짜는 28일 입니다.");
			break;
		default : 
			System.out.println("숫자를 잘못 입력하셨습니다.");
			break;
		}
		
		
		// 동일한 조건식을 if문 으로 작성해보기
		
		System.out.println("숫자를 입력해 주세요. (1부터 12까지만 가능) : ");
		int ifMonth = sc.nextInt();
		if(ifMonth == 1 || ifMonth == 3 || ifMonth == 5 || ifMonth == 7 || ifMonth == 8 || ifMonth == 10 || ifMonth == 12) {
			System.out.print(ifMonth+"월의 마지막 날짜는 31일 입니다.");
		}else if (ifMonth == 2) {
			System.out.print(ifMonth+"월의 마지막 날짜는 28일 입니다.");
		}else if (ifMonth == 4 || ifMonth == 6|| ifMonth == 9|| ifMonth == 11) {
			System.out.print(ifMonth+"월의 마지막 날짜는 31일 입니다.");
		}
		else {
			System.out.print("숫자를 잘못 입력하셨습니다.");
		}
		
		
		sc.close();
	}

}