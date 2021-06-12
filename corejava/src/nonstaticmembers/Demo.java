package nonstaticmembers;

public class Demo {
// RefrncInStaticMeth
	static Demo obj = new Demo();
	
	static{
		System.out.println(Demo.obj+ "a");
//		Demo.init();/*call for commented method*/
		Demo.obj = Demo.init();
	}
	public static void main(String[] args) {
		System.out.println(Demo.obj);
	}
	
	static Demo init(){
		return new Demo();
	}
	
	/* static void init(){ 
	 * same metho we can write like below we ca return instance directly withtout creating an object 
		Demo.obj = new Demo();
	}*/
	
}
