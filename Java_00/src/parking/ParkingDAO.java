package parking;

public class ParkingDAO {
	
	static final int ROW = 4;
	static final int COL = 3;

	String[][]parkingSpace;
	
	public ParkingDAO() {
		parkingSpace = new String [ROW][COL];
	}
	
	public void insertParking(int locationRow,int locationCol,String carNum) {
		parkingSpace[locationRow-1][locationCol-1] = carNum;
	}
	
	public void deleteParking(int locationRow,int locationCol) {
		parkingSpace[locationRow][locationCol] = null;
	}
	
	public String[][] selectParking() {
		return parkingSpace;
	}
	
}
