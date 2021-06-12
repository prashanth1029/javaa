package staticrrelated;

public class StaticMethods {

	public static void main(String[] args) {
		System.out.println("inside main()");
		StaticMethods.method1();
	}

	static void method1() {
		System.out.println("inside method1()");
	}

	static {
		System.out.println("inside static block");
		StaticMethods.method1();
	}

}
