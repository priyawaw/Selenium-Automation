package Assignments;

public class ArithmeticOperations2 {

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

		ArithmeticOperations2 ao = new ArithmeticOperations2();
		int mulresult = ao.mul(10, 2);
		int subresult = ao.sub(mulresult, 2);
		int addresult = ao.add(subresult,2);
		int subresult1 = ao.sub(addresult, 2);
		ao.div(subresult1, 2);

	}

}
