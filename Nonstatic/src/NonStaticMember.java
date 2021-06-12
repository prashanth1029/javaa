
public class NonStaticMember {
	int num;
	NonStaticMember(){
		System.out.println("inside the constructor");
	}
	{
		System.out.println("inside nonstatic block");
	}
	public static void main(String[] args) {
		System.out.println("inside main()");
		new NonStaticMember();
	}

}
