package countword;

import java.util.Scanner;

public class Wordcount {

	public static void main(String[] args) {
		int count=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the string");
		String s = scn.nextLine();
		System.out.println(s);
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ')
				count++;
			}
		System.out.println("no. of words in the given string are  "+(count+1));	
		
	}

}
