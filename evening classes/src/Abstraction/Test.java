package Abstraction;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the cars audi Bgt volvo..");
		String s = scn.next();
		Car obj = Factory.getInstance(s);
		if (s.equalsIgnoreCase("bgt") || s.equalsIgnoreCase("audi") || s.equalsIgnoreCase("volvo")) {
			obj.start();
			obj.run();
			obj.stop();
		} else {
			System.out.println("invalid input");

		}
	}
}
