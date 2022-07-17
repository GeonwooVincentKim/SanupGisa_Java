public class ClassB extends ClassA {
	ClassB() {
		super();
		System.out.println('D');
	}

	void prn() {
		System.out.println("E");
	}

	void prn(int x) {
		System.out.println(x);
	}
}
