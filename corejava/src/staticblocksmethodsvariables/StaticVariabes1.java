package staticblocksmethodsvariables;

public class StaticVariabes1 {

	static int num;

	public static void main(String[] args) {
		num = 1;
		System.out.println(StaticVariabes1.num);
		StaticVariabes1 p = new StaticVariabes1();
		p.prashi();
	}

	void prashi() {
		num = 2;
		System.out.println(num);
	}
}
