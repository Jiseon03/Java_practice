package java_01;
import java.util.Scanner;
public class IfEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// -----------------------------------------------------
		// 학생의 성적을 Scanner로 입력받아, 학점을 출력하세요.
		//
		// 90점 이상이면, A
		// 80점 이상이면, B
		// 70점 이상이면, C
		// 60점 이상이면, D
		// 60점 미만이면, F
		// -----------------------------------------------------
		
		System.out.println("점수 : ");
		int grade = sc.nextInt();
		if(grade>=90) {
			System.out.println('A');
		}else if(grade>=80) {
			System.out.println('B');
		}
		else if(grade>=70) {
			System.out.println('C');
		}
		else if(grade>=60) {
			System.out.println('D');
		}
		else{
			System.out.println('F');
		}
		
		// -----------------------------------------------------
		// Scanner를 통해 1부터 5까지의 숫자를 입력 받아 영문으로 변환
		// 
		// [ 결과 예시 ] 1 은 one 입니다.
		// -----------------------------------------------------
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		String result = "";
		if(num == 1) {
			result = "one";
		}else if (num == 2) {
			result = "two";
		}
		else if (num == 3) {
			result = "three";
		}
		else if (num == 4) {
			result = "four";
		}
		else if (num == 5) {
			result = "five";
		}else {
			result = "처리 불가 숫자";
		}
		
		System.out.println(num +"은 "+ result + "입니다.");
		sc.close();
	}

}