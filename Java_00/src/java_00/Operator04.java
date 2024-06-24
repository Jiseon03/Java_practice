package java_00; 

public class Operator04 {
	public static void main(String[] args) {

		/*
		 * [ 당신의 선택은? 치킨 vs 소 ]
		 * 
		 * 입력받을 변수는 1 또는 2
		 * 1번은 닭 vs 2번은 소
		 * 닭은 치킨 vs 소는 스테이크
		 * 
		 * 결과물 예시 : 가져오신 동물은 닭이므로, 치킨을(를) 요리하겠습니다.
		 * 결과물 예시 : 가져오신 동물은 소이므로, 스테이크을(를) 요리하겠습니다.
		 * 
		 */
		int num1 = 2;
		//num1이 1보다 작거나 같으면 resultAnimal = '닭', 1보다 크면 resultAnimal = '소'
		String resultAnimal = (num1 <= 1) ? "닭":"소";
		//resultAnimal의 값이 '닭'이면 resultDish = '치킨', '닭'이 아니면 resultDishl = '스테이크'
		String resultDish = (resultAnimal == "닭") ? "치킨":"스테이크";
		
		System.out.println("가져오신 동물은 "+ resultAnimal +"이므로,"+ resultDish +"을(를) 요리하겠습니다.");
		
		
		
		 
		/*
		 * [ 홀짝 감별기 ]
		 * 
		 * 입력받은 변수의 값이 홀이냐 짝이냐를 구분
		 *  
		 * 결과물 예시 : 입력하신 숫자 3은(는) 홀수입니다.
		 * 결과물 예시 : 입력하신 숫자 8은(는) 짝수입니다.
		 * 
		 */
		int varNum = 4;
		//varNum을 2로 나눈 나머지가 0이면 짝수 , 나머지가 0이 아니면 홀수
		String varNumResult = (varNum % 2 == 0)? "짝수":"홀수";
		
		System.out.println("입력하신 숫자 "+ varNum +"은(는) "+ varNumResult +"입니다");	
		
		
		//평균 구하기
		//평균을 구하여 85점 이상이면 합격 미만이면 불합격
		int kor = 85;
		int eng = 90;
		int math = 61;
		float avg = (kor+eng+math)/3.0f;
		String avgResult = (avg>=85) ? "합격" : "불합격" ;
		
		System.out.println("당신의 국어 점수는 "+ kor +"점 입니다");	
		System.out.println("당신의 영어 점수는 "+ eng +"점 입니다");	
		System.out.println("당신의 수학 점수는 "+ math +"점 입니다");	
		System.out.println("당신의 평균점수는 "+ avg +"이고, "+ avgResult +"입니다");	
		

	}
}
