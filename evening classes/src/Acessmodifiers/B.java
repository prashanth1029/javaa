package Acessmodifiers;

public class B extends A {
B()
{
	System.out.println("get lost");
}
protected void m1(){// her we can make this m1() as protected bcz here accessibility increasing 
	System.out.println("ABC");//here overriding m1() with more acessibility
}
int m1(int i,int j){
	System.out.println("wow!");
	return 0;
}
}
