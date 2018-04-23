package nl.hva.asv;

/**
 * This class mainly exists for educational purposes. It is used as part
 * of the course Automated Software Validation.
 *
 * TODO 04: Understand this class
 * TODO 05: Generate unitary tests (there is a bug in this code!)
 * TODO 06: Fix the code and run the test again
 */
public class OurMath {

	/**
	 * Calculates the square root of a decimal number. The algorithm is taken
	 * from
	 * http://www.programcreek.com/2012/02/java-calculate-square-root-without-using-library-method/
	 * 
	 * @param number
	 *            the number for which the square root is to be calculated.
	 * @return the square root of {@code number}.
	 */
	public static double sqrt(double number) {
		double squareRoot = number / 2;
		double t;

		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);

		return squareRoot;
	}

}
