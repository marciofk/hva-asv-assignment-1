package nl.hva.asv;

/**
 * This class mainly exists for educational purposes. It is used as part
 * of the course Automated Software Validation.
 *
 * TODO 07: Understand this class
 * TODO 08: Generate unitary tests (there is a bug in this code!)
 * TODO 09: Fix the code and run the test again
 * TODO 10: Make sure that this code has a test coverage of 100% for instructions and branches
 */
public class PasswordChecker {

	public boolean checkPassword(String password) {

		boolean hasUpper = false, hasLower = false, hasNum = false;

		if (password.length() < 6 || password.length() > 32) {
			return false;
		}

		for (int i = 0; i < password.length(); i++) {

			if (Character.isLetter(password.charAt(i))) {
				if (Character.isUpperCase(password.charAt(i))) {
					hasUpper = true;
				} else {
					hasLower = true;
				}
			} else if (Character.isDigit(password.charAt(i))) {
				hasNum = true;
			} else {
				return false;
			}
		}

		if (hasUpper == true && hasLower == true && hasNum == true)
			return true;
		else
			return false;
	}

}
