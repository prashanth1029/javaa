import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the string");
		String s = scn.nextLine();
		String t = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length() / 2; i++) {
			char a = ch[i];
			ch[i] = ch[ch.length - 1 - i];
			ch[ch.length - 1 - i] = a;
		}
		for (int i = 0; i < s.length(); i++) {
			t += ch[i];
		}
	System.out.println(t);
	}

}
