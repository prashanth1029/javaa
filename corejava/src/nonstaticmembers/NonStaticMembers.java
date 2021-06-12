package nonstaticmembers;

public class NonStaticMembers {

	int num;
	
	NonStaticMembers(){
		System.out.println("Inside the constructor");
	}
	
	{
		System.out.println("inside the nonstatic block");
	}
	
	public static void main(String[] args) {
		System.out.println("inside the main method");
		new NonStaticMembers();
	}
}
