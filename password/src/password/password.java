package password;

import java.util.Scanner;
import java.util.*;

public class password {

	public static void main(String[] args) {
		int up = 0, low = 0, spl = 0, add = 0, num = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the password");
		String s = scn.nextLine();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
				up++;
			else if (s.charAt(i) >= 97 && s.charAt(i) <= 122)
				low++;
			else if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
				num++;
			else if (s.charAt(i) >= 33 && s.charAt(i) <= 64)
				spl++;
			else
				System.out.println("space is not allowed");
		}
		if (up == 0) {
			System.out.println("please enter atlaest one upper case leeter in the password");
			add++;
		}
		if (low == 0) {
			System.out.println("please enter atlaest one lower case leeter in the password");
			add++;
		}
		if (num == 0) {
			System.out.println("please enter atlaest one numeric in the password");
			add++;
		}
		if (spl == 0) {
			System.out.println("please enter atlaest one special  symbol in the password");
			add++;
		}
		if (add > 0) {
			System.out.println("add other" + add + "characters make password strong");
		}
		if(spl!=0&&low!=0&&num!=0&&up!=0)
		{
			System.out.println("strong password");
		}
	}
}
