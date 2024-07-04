package hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelDAO {

	final int RoomCnt = 10;

	List<room> roomList;

	public HotelDAO() {
		roomList = new ArrayList<room>(RoomCnt);

		for(int i=0;i<RoomCnt;i++) {
			roomList.add(new room(false));
		}
	}

	public void checkIn(int roomNum) {
		roomList.set(roomNum-1, new room(true));
	}
	
	public void checkOut(int roomNum) {
		roomList.set(roomNum-1, new room(false));
	}
	
	
	public boolean selectRoomChk(int roomNum) {
		boolean isFlag = false;
		isFlag = roomList.get(roomNum-1).isUsing();

		return isFlag;
	}

	
	public List<room> selectRoomList() {	
		return roomList;
	}
}
