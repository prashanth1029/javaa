import java.util.Scanner;

public class TwoRhombus {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("enter the value of n=");
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <i ; j++) {
				System.out.print(" ");	
			}
			for (int j = 0; j <n- i - 1; j++) {
				System.out.print("*");
			}for (int j = 0; j <=n- i - 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i ; j++) {
				System.out.print(" ");	
			}
			for (int j = 0; j < i ; j++) {
				System.out.print(" ");	
			}
			for (int j = 0; j <n- i - 1; j++) {
				System.out.print("*");
			}for (int j = 0; j <=n- i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
