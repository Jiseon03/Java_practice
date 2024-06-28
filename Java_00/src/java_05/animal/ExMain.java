package java_05.animal;

public class ExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		
		animal.move();
		animal.moveAnimal(new Human());
		animal.moveAnimal(new tiger());
		animal.moveAnimal(new Eagle());
	}

}
