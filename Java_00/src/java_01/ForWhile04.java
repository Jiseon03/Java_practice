package java_01;

public class ForWhile04 {

	public static void main(String[] args) {

		// 1~9단까지 구구단을 모두 출력해 보세요.
		
		// while 문 활용
		System.out.println("====== [ while문 ] 구구단 ==========");
		int wnum1=1;
		
		
		while(wnum1<=9) {
			System.out.println("==========="+(wnum1+1)+"단=========");
			int wnum2=1; 
			while(wnum2<=9) {
				
				int wResult = wnum1*wnum2;
				System.out.println(wnum1+"*"+wnum2+"="+wResult);
				wnum2++;
			}
			wnum1++;
		}
		
		
		// for 문 활용
		System.out.println("====== [ for문 ] 구구단 ==========");
		for(int num1=1;num1<=9;num1++) {
			System.out.println("=========="+num1+"단=========");
			for(int num2=1 ;num2<=9 ;num2++) {
				int result = num1*num2;
				System.out.println(num1+"*"+num2+"="+result);
			}
		}
		
		
		
		

		
	}

}