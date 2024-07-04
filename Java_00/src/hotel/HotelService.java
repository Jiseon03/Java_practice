package hotel;

import java.util.List;
import java.util.Scanner;

public class HotelService {

	public static HotelDAO hotelDAO;
	public static Scanner sc = new Scanner(System.in);
	
	public HotelService() {
		hotelDAO = new HotelDAO();
	}
	
	public void startProgram() {
		
		while(true) {
			int choice = printMenu();
			switch(choice) {
				case 1:
					checkIn();
					break;
				case 2:
					checkOut();
					break;
				case 3:
					roomInfo();
					break;
				case 4:
					System.out.println("프로그램 종료");
					System.exit(0);
					break;
				default:
					System.out.println("1~4 까지의 정수만 입력할 수 있습니다.");
					break;
			}
		}
		
	}
	
	public int printMenu() {
		
		int choice = 0;
		System.out.println("==============호텔 관리 프로그램==============");
		System.out.println("[호텔에는 총 "+ hotelDAO.RoomCnt +"개의 객실이 있습니다.]");
		System.out.println("-----------------------------------------");
		System.out.println("1.입실 2.퇴실 3.방보기 4.종료");
		System.out.print("선택 : ");
		
		choice = sc.nextInt();
		
		return choice;
	}
	
	public void checkIn() {
		System.out.print("몇 번 방에 입실하시겠습니까? ");
		int roomNum = sc.nextInt();
		
		if(roomNum<1||roomNum>hotelDAO.RoomCnt) {
			System.out.println("호텔에는 1 ~" + hotelDAO.RoomCnt + "호실 까지의 객실이 있습니다.");
		}else if(hotelDAO.selectRoomChk(roomNum)){
			System.out.println("해당 객실은 이미 손님이 계십니다. 다른 객실을 선택해 주세요");
		}
		else {
			//객실 체크인
			hotelDAO.checkIn(roomNum);
			System.out.println("객실 체크인이 완료 되었습니다. 즐거운 하루 되세요!!");
			System.out.println("");
		}
	}
	
	public void checkOut() {
		System.out.print("몇 번 방에 퇴실하시겠습니까? ");
		int roomNum = sc.nextInt();
		
		if(roomNum<1||roomNum>hotelDAO.RoomCnt) {
			System.out.println("호텔에는 1 ~" + hotelDAO.RoomCnt + "호실 까지의 객실이 있습니다.");
		}else if(hotelDAO.selectRoomChk(roomNum)==false){
			System.out.println("해당 객실은 비어있습니다. 다른 객실을 선택해 주세요"); 
		}
		else {
			//객실 체크아웃
			hotelDAO.checkOut(roomNum);
			System.out.println("객실 체크아웃이 완료 되었습니다. 즐거운 하루 되세요!!");
			System.out.println("");
		}
	}
	
	public void roomInfo() {
		
		List<room> roomList = hotelDAO.selectRoomList();
		
		int cnt = 1;
		
		for(room r : roomList) {
			if(r.isUsing() == true) {
				System.out.println(cnt+"호 객실에는 현재 손님이 있습니다.");
			}else {
				System.out.println(cnt+"호 객실에는 비어 있습니다.");
			}
			cnt++;
		}
		
	}
	
}
