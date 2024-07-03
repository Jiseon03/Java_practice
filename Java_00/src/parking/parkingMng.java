package parking;

import java.util.Scanner;

public class parkingMng {

	public static Scanner sc = new Scanner(System.in);

	static final int ROW = 4;
	static final int COL = 3;


	public static void main(String[] args) {

		//[행개수][열개수] 행이 가로줄 열이 세로줄
		String[][]parkingSpace = new String [ROW][COL];

		while(true) {
			System.out.println("주차장 현황");
			System.out.println("  1 2 3 ");
			for(int i=0;i<parkingSpace.length;i++) {
				System.out.print(i+1+" ");

				for(int j=0;j<parkingSpace[i].length;j++) {

					if(parkingSpace[i][j] == null) {
						System.out.print("□ ");	
					}else {
						System.out.print("■ ");
					}	
				}
				System.out.println();
			}

			System.out.println();
			System.out.println("원하는 메뉴를 선택해 주세요");
			System.out.println("1.주차  2. 출차  3.종료");
			String menu = sc.next();

			switch(menu) {
			case "1":
				System.out.println("주차하고 싶은 위치를 선택해 주세요");
				System.out.println("(예시): 세로 가로 - 2 1");

				System.out.println("세로 :");
				int locationRow = sc.nextInt();
				System.out.println("가로 :");
				int locationCol = sc.nextInt();

				if(locationRow>ROW || locationCol>COL){
					System.out.println("주차 위치를 잘못 입력하셨습니다.");
					System.out.println("처음부터 다시 시작하세요.");

					break;
				}

				if(parkingSpace[locationRow-1][locationCol-1] != null) {
					System.out.println("이미 주차된 자리입니다.");
					System.out.println("처음부터 다시 시작하세요.");

					break;
				}

				System.out.println("주차 차량의 번호를 입력해 주세요. (예: 20가1234)");
				String carNum = sc.next();

				System.out.println(carNum + "차량 번호가 맞습니까? (y/n)");
				String confirm = sc.next();

				if("y".equals(confirm)) {
					parkingSpace[locationRow-1][locationCol-1] = carNum;

					System.out.println("주차가 완료되었습니다.");

				}else {
					System.out.println("처음부터 다시 시작하세요.");
					break;
				}
				break;
			case "2":
				System.out.println("차량 번호를 입력해주세요 : ");
				String number = sc.next();

				int count = 0;
				
				for(int i=0;i<parkingSpace.length;i++) {
					for(int j=0;j<parkingSpace[i].length;j++) {
						if(number.equals(parkingSpace[i][j])) {
							parkingSpace[i][j] = null;
							System.out.println("출차 완료");
							break;
						}else {
							count++;
						}		
					}
				}
				
				if(count == ROW * COL) {
					System.out.println("차량이 존재하지 않습니다.");
				}

				break;
			case "3":
				System.out.println("프로그램 종료");
				//학습을 위한 명령어 (실제 사용 X) 콘솔창을 강제 종료해줌 
				System.exit(0);

				break;
			default:
				break;
			}
		}

	}

}
