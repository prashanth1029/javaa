package typesliteralsvariables;

public class ImplicitCast {

	public static void main(String[] args) {
		
		byte b = 100;
		int i = b;
		System.out.println(i);
		
		long l = i;
		
		char ch = 'a';
		int x = ch;
		System.out.println(x);
	}
}
