package Assignments;

import java.util.Scanner;

public class ArithmeticOperations1 {

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

		ArithmeticOperations1 ao = new ArithmeticOperations1();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first no");
		int a = s.nextInt();
		System.out.println("Enter second no");
		int b = s.nextInt();
		int sumresult = ao.add(a, b);
		int subresult = ao.sub(sumresult, 2);
		int sumresult1 = ao.add(subresult, 6);
		int mulresult = ao.mul(sumresult1, 9);
		ao.div(mulresult, 2);
		System.out.println("Result is displayed as mentioned above ");

	}

}
