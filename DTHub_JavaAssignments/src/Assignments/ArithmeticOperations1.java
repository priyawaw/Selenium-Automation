package Assignments;

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
		int sumresult = ao.add(10, 2);
		int sumresult1 = ao.add(sumresult, 2);
		int subresult = ao.sub(sumresult1, 2);
		int mulresult = ao.mul(subresult, 2);
		ao.div(mulresult, 2);

	}

}
