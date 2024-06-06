package Assignments;

public class Constructor {

	public Constructor() {
		this(4, 8, 12);
		System.out.println("Default constructor should display");

	}

	public Constructor(int a) {
		this();
		System.out.println("One parameterized constructor should display");

	}

	public Constructor(int a, int b) {
		this(88);
		System.out.println("Two parameterized constructor should display");

	}

	public Constructor(int a, int b, int c) {
		System.out.println("Three parameterized constructor should display");

	}

	public static void main(String[] args) {
		Constructor con = new Constructor(25, 88);

	}

}
