package CompiletimeBinding;

public class Test {
	public static void main(String[] args) {
		Overloading a= new Overloading();
	System.out.println(a.add(10,20));
	System.out.println(a.add(10,20,30));
	System.out.println(a.add(10.55f,20));
	System.out.println(a.add());
	System.out.println(a.add(11,20,55.f,89.9));
	}
}
