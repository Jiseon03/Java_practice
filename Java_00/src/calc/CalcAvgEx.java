package calc;

import java.util.Scanner;

public class CalcAvgEx {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		[ 요구사항 ]
		- 숫자를 연속으로 입력받아 평균값을 구하세요.
		- 숫자 0 을 입력 받으면 반복을 멈추고 최종 결과를 보여주세요.
		--------------------------
		 */
		int num = 0;
		int sum = 0;
		int avg = 0;
		int count = 0;
		boolean flag = true;
		String calcStr = "";
		
		while(flag) {
			num = getNum();
			if(num == 0) {
				flag = false;
				System.out.println("평균은 "+avg+" 입니다");
				continue;
			}
			
			count++;
			sum = sum + num;
			avg = sum / count;
			
			if("".equals(calcStr)) {
				calcStr = ""+num;
			}else {
				calcStr = calcStr + "+" + num ; 
				 
			}
			
			
			System.out.println(calcStr);
		}
	}
	
	
	public static int getNum() {
		System.out.println("숫자를 입력하세요  : ");
		int num = sc.nextInt();
		return num;
	}
}