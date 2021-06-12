import java.util.Scanner;
public class Bigbigbig {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int n=scn.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i;j++)
			{	if(i==0||j==0||i==j)
				System.out.print("*");	
			else
				System.out.print(" ");
			}
			for( int j=0;j<i;j++)
				System.out.print("*");
			for( int j=0;j<n-i;j++)
				System.out.print("*");
			for( int j=0;j<i;j++)
				System.out.print(" ");
			for( int j=0;j<i;j++)
				System.out.print(" ");
			for( int j=0;j<n-i;j++)
				System.out.print("*");
			for( int j=0;j<n;j++){
				if(i==0||i==n-1||j==n-1||j==n/2||i==n/2||i==j||i+j==n-1||j==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for( int j=0;j<=i;j++)
				System.out.print("*");
			for( int j=0;j<n-i;j++)
				System.out.print(" ");
			for( int j=0;j<n-i;j++)
				System.out.print(" ");
			for( int j=0;j<=i;j++)
				System.out.print("*");
			for( int j=0;j<i;j++)
				System.out.print("*");
			for( int j=0;j<n-i;j++)
				System.out.print(" ");
			for( int j=0;j<n-i;j++)
				System.out.print(" ");
			for( int j=0;j<=i;j++)
				System.out.print("*");
			for( int j=0;j<n;j++)
				System.out.print("*");
			for( int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=0;i<n;i++){
			for( int j=0;j<n-i;j++)
				System.out.print("*");
			for(int j=0;j<i;j++)
			{	if(i==n-1||j==n-1||(i==j))
				System.out.print("*");	
			else
				System.out.print(" ");
			}
			for( int j=0;j<i;j++)
				System.out.print("*");
			for( int j=0;j<n-i;j++)
				System.out.print(" ");
			for( int j=0;j<n-i;j++)
				System.out.print(" ");
			for( int j=0;j<n-i;j++)
				System.out.print("*");
			for( int j=0;j<=i;j++)
				System.out.print(" ");
			for( int j=0;j<i;j++)
				System.out.print(" ");
			for( int j=0;j<n-i;j++)
				System.out.print("*");
			for( int j=0;j<i;j++)
				System.out.print(" ");
			for( int j=0;j<=i;j++)
				System.out.print(" ");
			for( int j=0;j<n-i;j++)
				System.out.print("*");
			for( int j=0;j<n-i;j++)
				System.out.print("*");
			for( int j=0;j<i;j++)
				System.out.print(" ");
			for( int j=0;j<=i;j++)
				System.out.print(" ");
			for( int j=0;j<n-i;j++)
				System.out.print("*");
			for( int j=0;j<n;j++)
				System.out.print("*");
			for( int j=0;j<=n-i;j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
