package objectsnclassnconstructers;

public class Earth {

	public static void main(String[] args) {

		Human prashi;
		prashi = new Human("prashanth", 23, 5.6f);

		prashi.speak();
		prashi.sleep();
		prashi.walk();
		prashi.talk();
		
		System.out.println();
		
		Human gv = new Human("Gavi", 30, 5.4f);
				
		gv.speak();
		gv.sleep();
		gv.walk();
		gv.talk();
	}
}
