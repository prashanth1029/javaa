
public class ObjRefCreation1 {
	static ObjRefCreation obj = new ObjRefCreation();
	static {
		System.out.println(ObjRefCreation.obj);
		ObjRefCreation.obj=ObjRefCreation.init();
	}

	public static void main(String[] args) {
		System.out.println(ObjRefCreation.obj);
	}

	static ObjRefCreation init() {
		return new ObjRefCreation();
	}
}
