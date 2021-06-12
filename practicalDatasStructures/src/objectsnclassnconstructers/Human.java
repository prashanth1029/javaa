package objectsnclassnconstructers;

public class Human {

	String name;
	int age;
	float height;

	public Human(String nm, int ag, float hgt) {
		name = nm;
		age = ag;
		height = hgt;
	}

	void speak() {
		System.out.println("my name is " + name);
		System.out.println("i am " + age + " years old");
		System.out.println("i am " + height + " inches tall");
	}

	void walk() {
		System.out.println(name + " can walk");
	}

	void talk() {
		System.out.println(name + " can talk");
	}

	void sleep() {
		System.out.println(name + " can sleep");
	}
}
