
public class DataType1 {

	public static void main(String[] args) {

		byte b = -128;
		System.out.println(b);
		short s = 1444;
		System.out.println(s);
		int i = 18956;
		System.out.println(i);
		long l = 12345678;
		System.out.println(l);
		char c = 'a';
		System.out.println(c);
		boolean k = true;
		System.out.println(k);
		float f = 1234.4321f;
		System.out.println(f);
		double d = 123456789.987654321d;
		System.out.println(d);
		byte h = 20;
		System.out.println(h);
		// byte n=b+h;always addition of two bytes must be int
		int n = b + h;
		System.out.println(n);
	}
}