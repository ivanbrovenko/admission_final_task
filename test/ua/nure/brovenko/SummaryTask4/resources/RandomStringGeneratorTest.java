package ua.nure.brovenko.SummaryTask4.resources;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * RandomStringGenerator test
 * @author Ivan Brovenko
 */
public class RandomStringGeneratorTest {

    /**
     * Generator object
     */
    private RandomStringGenerator randomStringGenerator;
    /**
     * Action before testing
     * @throws Exception if something goes wrong
     */
    @Before
    public void setUp() throws Exception {
        randomStringGenerator=new RandomStringGenerator();
    }

    @Test
    public void getSaltString() throws Exception {
        assertNotEquals(randomStringGenerator.getSaltString(),randomStringGenerator.getSaltString());
        assertNotNull(randomStringGenerator.getSaltString());
    }

}