package oopJavaCalc;

public class JavaCalculator {
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public int square (int num) {
		return num * num;
	}
	
	public static void main(String[] args) {
		JavaCalculator calc = new JavaCalculator();
		int x = 12;
		int y = 4;
		
		System.out.printf("12 + 4 = %d\n", calc.add(x, y));
		System.out.printf("12 - 4 = %d\n", calc.subtract(x, y));
		System.out.printf("12 * 4 = %d\n", calc.multiply(x, y));
		System.out.printf("12 / 4 = %d\n", calc.divide(x, y));
		System.out.printf("12 ^ 2 = %d\n", calc.square(x));
	}
}