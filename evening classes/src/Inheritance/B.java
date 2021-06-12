package Inheritance;

public class B extends A {
	// int i=30;
	// int j=40;
	/*
	 * void m1(){ System.out.println("bye"); } void m2(){
	 * System.out.println("bye1"); }
	 */
/*	void m1() {
		System.out.println("hey");
	}*/

	void m2() {
		System.out.println("hey1");
		m1();
	}
	/*
	 * void disp(){//here parents i,j values are printed bcz the variab;e values
	 * are also inherited from thje parent classes System.out.println(i);
	 * System.out.println(j); }
	 */
}
