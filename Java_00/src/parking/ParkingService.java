package parking;

import java.util.Scanner;

public class ParkingService {

	public static ParkingDAO parkingDAO;
	
	public static Scanner sc = new Scanner(System.in);
	
	public ParkingService() {
		parkingDAO = new ParkingDAO();
	}
			
	
	public void startProgram() {
		while(true) {
			
			int menu = printMenu();

			switch(menu) {
			case 1:
				inParking();
				break;
			case 2:
				outParking();
				break;
			case 3:
				System.out.println("프로그램 종료");
				//학습을 위한 명령어 (실제 사용 X) 콘솔창을 강제 종료해줌 
				System.exit(0);
				break;
			default:
				System.out.println("1~3 사이의 수를 선택해 주세요");
				break;
			}
		}
	}


	public int printMenu() {
		System.out.println("주차장 현황");
		System.out.println("  1 2 3 ");
		
		String[][] parkingSpace = parkingDAO.parkingSpace;
		
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
		int menu = sc.nextInt();
		
		return menu;
	}

	public void inParking() {
		String[][] parkingSpace = parkingDAO.selectParking();
		
		System.out.println("주차하고 싶은 위치를 선택해 주세요");
		System.out.println("(예시): 세로 가로 - 2 1");

		System.out.println("세로 :");
		int locationRow = sc.nextInt();
		System.out.println("가로 :");
		int locationCol = sc.nextInt();

		if(locationRow>parkingDAO.ROW|| locationCol>parkingDAO.COL){
			System.out.println("주차 위치를 잘못 입력하셨습니다.");
			System.out.println("처음부터 다시 시작하세요.");

		}else if (parkingSpace[locationRow-1][locationCol-1] != null) {
			System.out.println("이미 주차된 자리입니다.");
			System.out.println("처음부터 다시 시작하세요.");
		}else {
			System.out.println("주차 차량의 번호를 입력해 주세요. (예: 20가1234)");
			String carNum = sc.next();

			System.out.println(carNum + "차량 번호가 맞습니까? (y/n)");
			String confirm = sc.next();

			if("y".equals(confirm)) {
//				parkingSpace[locationRow-1][locationCol-1] = carNum;
				parkingDAO.insertParking(locationRow, locationCol, carNum);
				System.out.println("주차가 완료되었습니다.");

			}else {
				System.out.println("처음부터 다시 시작하세요.");
			}		
		}
	
	}


	public void outParking() {
		String[][] parkingSpace = parkingDAO.selectParking();
		
		System.out.println("차량 번호를 입력해주세요 : ");
		String number = sc.next();

		int count = 0;

		for(int i=0;i<parkingSpace.length;i++) {
			for(int j=0;j<parkingSpace[i].length;j++) {
				if(number.equals(parkingSpace[i][j])) {
//					parkingSpace[locationRow][locationCol] = null;
					parkingDAO.deleteParking(i, j);
					System.out.println("출차 완료");
					break;
				}else {
					count++;
				}		
			}
		}

		if(count == parkingDAO.ROW * parkingDAO.COL) {
			System.out.println("차량이 존재하지 않습니다.");
		}
	}
}
