package Assignments;

public class Method {

	int age, rollno;

	public void display1() {

		System.out.println("Welcome to all of you");

	}

	public void display2() {

		System.out.println("Automation is very easy");

	}

	public static void main(String[] args) {

		Method Md = new Method();
		Md.display1();
		Md.display2();
		Md.age = 32;
		Md.rollno = 8;

		System.out.println("Student age is "   +  Md.age);
		System.out.println("Student rollno is "   +  Md.rollno);

	}

}
