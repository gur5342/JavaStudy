package ch09;

public class CarMain {
	static void drive(Car car) {
		car.move();
	}
	public static void main(String[] args) {
		SporsCar sc = new SporsCar();
		drive(sc);
		SportsCar2 sc2 = new SportsCar2();
		drive(sc2);
	}

}
