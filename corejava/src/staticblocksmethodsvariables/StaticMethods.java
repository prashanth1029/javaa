package staticblocksmethodsvariables;

public class StaticMethods {

	public static void main(String[] args) {
		System.out.println("in main");
		
		StaticMethods.method1();
	}
	
	static void method1(){
		System.out.println("inside static method1");
	}
	
	static{
		System.out.println("in static block");
		StaticMethods.method1();
	}
}
