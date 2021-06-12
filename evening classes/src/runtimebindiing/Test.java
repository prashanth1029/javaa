package runtimebindiing;

public class Test {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		Car c = new Car();
		Bike b = new Bike();
		
		System.out.println(v.fuel());
		System.out.println(c.fuel());
		System.out.println(b.fuel());

	}

}
