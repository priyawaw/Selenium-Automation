package Assignments;

import java.util.Scanner;

public class ScannerAssignment2 {

	public int add(int a, int b) {

		int c;
		c = a + b;
		System.out.println("Addition is :" + c);
		return c;

	}

	public int sub(int a, int b) {

		int c;
		c = a - b;
		System.out.println("Substraction is :" + c);
		return c;

	}

	public int mul(int a, int b) {

		int c;
		c = a * b;
		System.out.println("Multiplication is :" + c);
		return c;

	}

	public void div(int a, int b) {

		int c;
		c = a / b;
		System.out.println("Division is :" + c);

	}

	public static void main(String[] args) {

		ScannerAssignment2 SA = new ScannerAssignment2();
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("Enter first no");
		int b = s.nextInt();
		System.out.println("Enter second no");
		int mulResult = SA.mul(10, 2);
		int sumResult = SA.add(mulResult, 2);
		int subResult = SA.sub(sumResult, 3);
		int sumResult1 = SA.add(subResult, 3);
		SA.div(sumResult1, 3);
		System.out.println("Result is displayed as mentioned above");

	}

}
