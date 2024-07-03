package parkingMng;

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
		
		String[][] parkingSpace = parkingDAO.selectParking();
		
		for(int i=0;i<parkingSpace.length;i++) {
			for(int j=0;j<parkingSpace[i].length;j++) {

				if(parkingSpace[i][j] == null) {
					System.out.print("□ "+ parkingDAO.parkingNum[i][j]+":"+parkingSpace[i][j]+"\t");	
				}else {
					System.out.print("■ "+ parkingDAO.parkingNum[i][j]+":"+parkingSpace[i][j]+"\t");
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
		System.out.println("예시)주차공간 선택 : 1");
		
		int location = sc.nextInt();
		String locationStr = String.valueOf(location);
		

		if(location < 1 || location > parkingDAO.ROW *parkingDAO.COL){
			System.out.println("주차 위치를 잘못 입력하셨습니다.");
			System.out.println("처음부터 다시 시작하세요.");
		}else if (parkingDAO.selectParkingSpace(locationStr) != null) {
			System.out.println("이미 주차된 자리입니다.");
			System.out.println("처음부터 다시 시작하세요.");
		}else {
			System.out.println("주차 차량의 번호를 입력해 주세요. (예: 20가1234)");
			String carNum = sc.next();

			System.out.println(carNum + "차량 번호가 맞습니까? (y/n)");
			String confirm = sc.next();

			if("y".equals(confirm)) {
				parkingDAO.insertParking(locationStr, carNum);
				System.out.println("주차가 완료되었습니다.");

			}else {
				System.out.println("처음부터 다시 시작하세요.");
			}		
		}
	
	}


	public void outParking() {
		String[][] parkingSpace = parkingDAO.selectParking();
		
		System.out.println("주차 위치를 입력해주세요 : ");
		int location = sc.nextInt();
		String locationStr = String.valueOf(location);
		boolean flag = false;
		if(parkingDAO.selectParkingSpace(locationStr) == null) {
			System.out.println("주차된 자리가 아닙니다.");
			System.out.println("처음부터 다시 시작하세요.");
		}else {
			for(int i=0;i<parkingSpace.length;i++) {
				for(int j=0;j<parkingSpace[i].length;j++) {
					
					if(locationStr.equals(parkingDAO.parkingNum[i][j])) {
						parkingDAO.deleteParking(i, j);
						System.out.println("출차 완료");
						
						flag = true;
						break;
					} 	
				}
			}
		}
		
		
			
		

	}
}
