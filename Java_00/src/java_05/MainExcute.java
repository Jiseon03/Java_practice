package java_05;

public class MainExcute {

	public static void main(String[] args) {
		//부모 클래스 생성자
		//Point point = new Point();
		Point point = new Point(1,2);
		
		System.out.println("point X : "+point.getX());
		System.out.println("point Y : "+point.getY());	
		
		point.setX(10);
		point.setY(20);
		
		System.out.println("point X : "+point.getX());
		System.out.println("point Y : "+point.getY());
		
		//자식 클래스 생성자 -> Point 클래스를 상속받았음
		//Circle circle = new Circle();
		Circle circle = new Circle(10,20);
		
		System.out.println("circle X : "+circle.getX());
		System.out.println("circle Y : "+circle.getY());
		
		circle.setX(100);
		circle.setY(320);

		System.out.println("circle X : "+circle.getX());
		System.out.println("circle Y : "+circle.getY());
	}

}
