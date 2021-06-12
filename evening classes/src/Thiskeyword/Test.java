package Thiskeyword;

public class Test {

	public static void main(String[] args) {
		A obj = new A();// error bcz we have parameterised constructor inside A
		System.out.println(obj.i);// bcz JVM won't initialize values bcz it wont
									// puts constructor only
		System.out.println(obj.j);// for above at instance creation we should
									// pass parameters bcs we have parameter
									//constructor there
	}// so we are no need to give A default constructor it will be put by jvm itself
		// itself
	// we no need write default constructir explicitly
}
