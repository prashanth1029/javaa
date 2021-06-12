package patternsallphabets;

import java.util.Scanner;

public class GeenericPat {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("enter the value of n=");
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==0||i==n-1||i==n/2||j==0||j==n-1||j==n/2||i==j||i+j==n-1||i+j==n/2||i-j==n/2||j-i==n/2||i+j==n+n/2-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
