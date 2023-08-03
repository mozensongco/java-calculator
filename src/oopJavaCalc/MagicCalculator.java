package oopJavaCalc;

public class MagicCalculator extends JavaCalculator {

	// I've only gotten to the factorial method so far. I'll most likely push the other methods to Github as I figure them out.
	public int factorial(int num) {
		int product = 1;
		if (num < 0) {
			System.out.print("Factorials for negative numbers are undefined... ");
		} else {
			for (int x = 1; x <= num; x++) {
				product *= x;
			}
		}
		return product;
	}
	
	public static void main(String[] args) {
		MagicCalculator calc2 = new MagicCalculator();
		System.out.printf("%d", calc2.factorial(-1));
	}
}
