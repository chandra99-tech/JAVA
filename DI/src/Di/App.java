package Di;

public class App {

	public static void main(String[] args) {
		Car c = new Car(new PetrolEngine());
		c.drive();
		Car d = new Car(new DiselEngine());
		d.drive();

	}

}
