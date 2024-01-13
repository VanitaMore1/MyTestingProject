package multipleInterface;

public interface Father {

	void hardwork();
	void honesty();
	default void love() {
		System.out.println("father love");
	}
	static void test() {
		System.out.println("father test");
	}
}
