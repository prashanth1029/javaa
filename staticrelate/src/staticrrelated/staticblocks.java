package staticrrelated;

public class staticblocks {
	static{
		System.out.println("inside static block2");
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	static{
		System.out.println("inside static block1");
	}
	
}
