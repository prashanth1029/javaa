package nonstaticmembers;

public class ThisKeyword {

	int x;

	ThisKeyword() {
		/*
		 * this keyword can only be used in nonstatic block or nonstatic context
		 */
		/*
		 * this keyword can't be used in static blocks or static methods or main
		 * method
		 */
		System.out.println(this);
		System.out.println(this.x);
		/*
		 * using this keyword we can refer to current objects members
		 * which could be variables or even methods
		 */
	}

	public static void main(String[] args) {
		new ThisKeyword();
		new ThisKeyword();
//		System.out.println(this);
	}
}
