package java_02;
import java.util.Scanner;
public class Method05 {

	public static void main(String[] args) {

		/*
		[ 요구사항 ]
		- 숫자를 입력받아 1부터 입력받은 숫자까지의 합을 구하시오.
		- Scanner를 통해 숫자 입력 받기
		- 숫자의 합을 구하는 구문은 메소드로 작성하기
		--------------------------
		 */
		System.out.println("숫자를 입력하세요  : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(input >= 1) {
			System.out.println("1부터 "+input+"까지의 합은 " + sum(input)+"입니다");
		}else {
			System.out.println("1보다 작은 숫자는 계산할 수 없습니다.");
		}
		

	}

	public static int sum(int input) {
		int sum = 0;
		for(int i=1;i<=input;i++) {
			sum = sum + i;
		}
		return sum;
	}
}