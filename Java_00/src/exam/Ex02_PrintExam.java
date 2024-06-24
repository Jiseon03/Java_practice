package exam;

public class Ex02_PrintExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = 12;
		int date = 25;
		String chrismas = "크리스마스";
		String lastyear = "2023";
		int intLastyear = Integer.parseInt(lastyear);
		float percent = 72.893f;
		int num1 = 100;
		int num2 = 10;
		int sum = num1 + num2;
		double cir = 3.141592653589793d;
		int radius = 5;
		double circle = cir*radius*2;
		double area = cir*radius*radius;
		char str1 = '뷁';
		int strInt1 = str1;
		float num3 = 58.74598f;
		int changeNum3 = (int) num3;
		
		
		System.out.println(month +"월 " + date +"일은 " + chrismas + " 입니다");
		System.out.println("작년 " + intLastyear +"년도 대학 합격률은 "+ percent + "퍼센트 였습니다.");
		System.out.println(num1+"이라는 숫자에 " + num2 +"을 더하면 "+ sum + "이 됩니다.");
		System.out.println("원주율은 " + cir +"이고, 반지름이"+ radius +"인 원의 둘레는 "+ circle + "입니다");
		System.out.println("반지름이 "+radius +"인 원의 넓이는 "+ area + "입니다");
		System.out.println(str1 + "의 문자번호는 " +strInt1 + "입니다.");
		System.out.println(num3 + "을 버림하면 " + changeNum3 +" 입니다.");
	}

}
