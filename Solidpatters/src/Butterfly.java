import java.util.Scanner;

public class Butterfly {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the no. of rows");
		int n=scn.nextInt();
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<i;j++)
				System.out.print("*");
			for(int j=0;j<n-1-i;j++)
				System.out.print(" ");
			for(int j=0;j<n-1-i;j++)
				System.out.print(" ");
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n-i-1;j++)
				System.out.print("*");
			for(int j=0;j<i;j++)
				System.out.print(" ");
			for(int j=0;j<=i;j++)
				System.out.print(" ");
			for(int j=0;j<n-i-2;j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
}
