package multipleInterface;

public interface Mother {

	void look();
	void hardwork();
	void nature();
	default void love() {
		System.out.println("mother love");
	}
	static void test() {
		System.out.println("mother test");
	}
}
