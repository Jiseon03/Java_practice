package java_00;

public class Operator02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 50;
		int c = 1;
		
		//1.
		System.out.println(a > b);
		//2.
		System.out.println(b >= c);
		//3.
		System.out.println(a < c);
		//4.
		System.out.println(a <= b);
		//5.
		System.out.println(a == b);
		//6.
		System.out.println(a != a);
		//7.
		System.out.println(b != c);
		
		// 사용자 나이 입력 - 19세 이상 통과, 미만 거절
				// true(통과), false(거절)
		 int age = 20;
		 boolean ageResult;
		 ageResult = age >=19;
		 System.out.println(ageResult);
		
		// 숫자 입력 - 짝수인지, 아닌지를 판단
		 int varNum = 21;
		 int varNumResult = varNum % 2;
		 boolean numFlag;
		 numFlag = varNumResult == 0;
		
	}

}
