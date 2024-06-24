package java_00;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int num1 = 10;
		int num2 = 20;
		
		int numResult;
		
		System.out.println("----숫자 바꾸기 전 ------");
		System.out.println("숫자 1 [" + num1 + "]");
		System.out.println("숫자 2 [" + num2 + "]");
		//System.out.println("더한 값 [" + numResult + "]");
		numResult = num1;
		num1 = num2;
		num2 = numResult;
		System.out.println("----숫자 바꾸기 후 ------");
		System.out.println("숫자 1 [" + num1 + "]");
		System.out.println("숫자 2 [" + num2 + "]");
		
		int var1 = 10;
		int var2 = 20;
		int var3 = 30;
		int varResult;
		System.out.println("----숫자 바꾸기 전------");
		System.out.println("숫자 1 [" + var1 + "]");
		System.out.println("숫자 2 [" + var2 + "]");
		System.out.println("숫자 2 [" + var3 + "]");
		
		varResult = var1;
		var1 = var2;
		var2= var3;
		var3 = varResult;
		
		System.out.println("----숫자 바꾸기 후------");
		System.out.println("숫자 1 [" + var1 + "]");
		System.out.println("숫자 2 [" + var2 + "]");
		System.out.println("숫자 2 [" + var3 + "]");
		*/
		//년도와 나이 계산
		int curYear = 2024;
		int varNum = 1;
		int yearResult;
		
		int curAge = 22;
		
		int ageResult;
		
		yearResult = curYear + varNum;
		ageResult = curAge + varNum;
		
		System.out.println("올해는 "+ curYear + "년도 입니다.");
		System.out.println("올해 내 나이는 "+ curAge + "입니다.");
		
		System.out.println("다음해는 "+ yearResult + "년도 입니다.");
		System.out.println("다음해 내 나이는 "+ ageResult + "입니다.");
		
		yearResult = yearResult + varNum;
		ageResult = ageResult + varNum;
		
		System.out.println("다다음해는 "+ yearResult + "년도 입니다.");
		System.out.println("다다음해 내 나이는 "+ ageResult + "입니다.");
		
		yearResult = yearResult + varNum;
		ageResult = ageResult + varNum;
		
		System.out.println("다다다음해는 "+ yearResult + "년도 입니다.");
		System.out.println("다다다음해 내 나이는 "+ ageResult + "입니다.");
		
		for(int i=0;i<6;i++) {
			System.out.println(i);
		}
	}

}
