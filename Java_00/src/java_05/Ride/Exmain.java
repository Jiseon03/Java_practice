package java_05.Ride;

public class Exmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ride ride = new Ride();
		 
		ride.move();
		
		ride.moveRide(new Air());
		ride.moveRide(new Bike());
		ride.moveRide(new Bus());
		ride.moveRide(new Cycle());
		ride.moveRide(new Ship());
	}

}
