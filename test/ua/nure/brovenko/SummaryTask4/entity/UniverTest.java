package ua.nure.brovenko.SummaryTask4.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * University test
 * @author Ivan Brovenko
 */
public class UniverTest  {

    /**
     * Univer object
     */
    private Univer univer;

    /**
     * Action before command will be created
     * @throws Exception if something goes wrong
     */
    @Before
    public void defaultConstructorTest() throws Exception {
        univer=new Univer();
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getId() throws Exception {
        univer.setId(1);
        assertEquals(univer.getId(),1);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setId() throws Exception {
        univer.setId(1);
        assertEquals(univer.getId(),1);
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getName() throws Exception {
        univer.setName("univer");
        assertEquals(univer.getName(),"univer");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setName() throws Exception {
        univer.setName("univer");
        assertEquals(univer.getName(),"univer");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getCityName() throws Exception {
        univer.setCityName("city");
        assertEquals(univer.getCityName(),"city");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setCityName() throws Exception {
        univer.setCityName("city");
        assertEquals(univer.getCityName(),"city");
    }

}