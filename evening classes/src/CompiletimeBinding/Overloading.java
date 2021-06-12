package CompiletimeBinding;

public class Overloading {

	int add(int i, int j) {
		System.out.println("returns intiger value");
		return i + j;
	}

	float add(float i, int j) {
		System.out.println("returns float value");
		return i + j;
	}

	int add(int h, int i, int j) {
		System.out.println("returns intiger value");
		return i + j + h;
	}
	boolean add(){
		System.out.println("yes i am inside the add method");
		return true;
	}
	double add(int a,int b,float c,double d){
		System.out.println("returns double value value");
		return a+b+c+d;
}
/*	public static void main(String[] args) {
		Overloading a= new Overloading();
	System.out.println(a.add(10,20));
	System.out.println(a.add(10,20,30));
	System.out.println(a.add(10.55f,20));	}*/
}

