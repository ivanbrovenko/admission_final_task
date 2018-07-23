package ua.nure.brovenko.SummaryTask4.encriptor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Password encriptor test
 * @author Ivan Brovenko
 */
public class PasswordEncriptorTest {

    /**
     * Testion hashMD5 method
     * @throws Exception if something goes wrong
     */
    @Test
    public void hashMD5() throws Exception {
        String testString="This is a test string";
        assertEquals(PasswordEncriptor.hashMD5(testString),PasswordEncriptor.hashMD5(testString));
    }

}