package nl.hva.asv;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestExample {

    @Test
    public void testBadPassword() {
        PasswordChecker checker = new PasswordChecker();

        assertFalse(checker.checkPassword("Test1"));
    }

}
