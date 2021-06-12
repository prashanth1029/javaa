package patternsallphabets;

import java.util.Scanner;

public class PatW {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("enter the value of n=");
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j==0||j==n-1||(i+j==n-1&&j<=(n/2))||((i==j)&&(j>=(n/2))))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
