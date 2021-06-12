import java.util.Scanner;
public class Reversingastring {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scn.nextLine();
		String temp="";
		for(int i=s.length()-1;i>=0;i--){
			temp +=s.charAt(i);
		}
		System.out.println(temp);
	}

}
