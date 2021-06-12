package typesliteralsvariables;

public class ExplicitCast {

	public static void main(String[] args) {
		
		int i = 100;
		byte b = (byte)i;
		System.out.println(i);
		
		int x = 97;
		char ch = (char)x;
		System.out.println(ch);
		
		int y = 131;/*it's beyond byte range it cosses -128 it will go in clockwise direction*/
		byte z = (byte)y;/*so we get -126 for 130 ,for 131 we ill get -125*/
		System.out.println(z);
		
		int m = 612;/* 256+256+100 = 612 */
		byte n = (byte)m;
		System.out.println(n);
		char o = (char)n;
		System.out.println(o);
		
	}
}
