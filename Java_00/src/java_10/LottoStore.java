package java_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class LottoStore {

	private Scanner sc = new Scanner(System.in);

	public static void main(String[]args) {
		new LottoStore().startLotto();
	}

	public void startLotto() {

		while(true) {
			int choice = displayMenu();
			switch(choice) {
			case 1:
				saleLotto();
				break;
			case 2:
				System.out.println("안녕히 가세요.");
				//break; 대신 return; -> 빠져나오고 싶을 때 사용
				return;
			default:
				System.out.println("1,2 만 입력할 수 있습니다.");
				break;
			}
		}
	}

	public int displayMenu() {
		System.out.println("=========== 로또 판매점 ============");
		System.out.println("1. Lotto 구매하기");
		System.out.println("2. 프로그램 종료");
		System.out.println("=================================");
		System.out.print("선택 :");

		int choice = sc.nextInt();

		return choice;
	}

	//로또 판매
	public void saleLotto() {
		System.out.println("1000원에 로또 번호 하나씩 입니다.");
		System.out.println("로또는 최대 100매 까지 구매 가능 합니다.");
		System.out.println("구매를 원하시는 금액을 입력해 주세요.");
		System.out.print("금액 입력 : ");
		int money = sc.nextInt();
		System.out.println();

		if(money<1000) {
			System.out.println("1000원 이상으로 입력해 주세요");
			return;
		}else if(money>100000) {
			System.out.println("10만원 이상은 구매 불가합니다.");
			return;
		}
		
		
		createLotto(money);

		System.out.println("받은 금액 : " + money + " 원, 거스름돈 : "+(money%1000)+" 원 입니다.");
		System.out.println();
	}

	//로또 번호 생성
	public void createLotto(int money) {
		int lottoCnt = money / 1000;
		//HashSet -> 중복된 data를 생성 할 수 없음
		HashSet<Integer> lottoSet = new HashSet<>();

		for(int i=1;i<=lottoCnt;i++) {
			while(lottoSet.size()<6) {
				int lottoNum =  (int) (Math.random() * 45 + 1);
				lottoSet.add(lottoNum);
			}

			ArrayList<Integer> lottoList = new ArrayList<Integer>(lottoSet);
			//숫자 정렬
			Collections.sort(lottoList);

			System.out.print("로또 번호 :" + i +"번 >>>");

			for(int lottoNum : lottoList) {
				System.out.print( lottoNum + " ");
			}

			System.out.println(" ");
			lottoSet.clear();
		}


	}
}
