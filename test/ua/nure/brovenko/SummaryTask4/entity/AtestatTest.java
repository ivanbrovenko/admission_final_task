package ua.nure.brovenko.SummaryTask4.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Atestat test
 * @author Ivan Brovenko
 */
public class AtestatTest {

    /**
     * Atestat object
     */
    private Atestat atestat;

    /**
     * Action before command will be created
     * @throws Exception if something goes wrong
     */
    @Before
    public void defaultConstructorTest() throws Exception {
        atestat=new Atestat();
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getId() throws Exception {
        atestat.setId(1);
        assertEquals(atestat.getId(),1);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setId() throws Exception {
        atestat.setId(1);
        assertEquals(atestat.getId(),1);
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getAvgMark() throws Exception {
        atestat.setAvgMark(300);
        assertEquals(atestat.getAvgMark(),300);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setAvgMark() throws Exception {
        atestat.setAvgMark(300);
        assertEquals(atestat.getAvgMark(),300);
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getImage() throws Exception {
        atestat.setImage("img");
        assertEquals(atestat.getImage(),"img");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setImage() throws Exception {
        atestat.setImage("img");
        assertEquals(atestat.getImage(),"img");
    }
}