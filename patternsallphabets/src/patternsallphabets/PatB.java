package patternsallphabets;

import java.util.Scanner;

public class PatB {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("enter the value of n=");
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j == 0||j==n-1)&&i!=0||(i==0||i==n/2)&&(j>0&&j<n-1) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
