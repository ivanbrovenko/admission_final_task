package ua.nure.brovenko.SummaryTask4.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Application test
 * @author Ivan Brovenko
 */
public class ApplicationTest {

    /**
     * Application object
     */
    private Application application;

    /**
     * Action before command will be created
     * @throws Exception if something goes wrong
     */
    @Before
    public void defaultConstructorTest() throws Exception {
        application=new Application();
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getId() throws Exception {
        application.setId(1);
        assertEquals(application.getId(),1);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setId() throws Exception {
        application.setId(1);
        assertEquals(application.getId(),1);
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getPrice() throws Exception {
        application.setPrice("f");
        assertEquals(application.getPrice(),"f");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setPrice() throws Exception {
        application.setPrice("f");
        assertEquals(application.getPrice(),"f");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getUniverName() throws Exception {
        application.setUniverName("univer");
        assertEquals(application.getUniverName(),"univer");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setUniverName() throws Exception {
        application.setUniverName("univer");
        assertEquals(application.getUniverName(),"univer");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getDepartmentName() throws Exception {
        application.setDepartmentName("department");
        assertEquals(application.getDepartmentName(),"department");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setDepartmentName() throws Exception {
        application.setDepartmentName("department");
        assertEquals(application.getDepartmentName(),"department");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getPriority() throws Exception {
        application.setPriority(5);
        assertEquals(application.getPriority(),5);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setPriority() throws Exception {
        application.setPriority(5);
        assertEquals(application.getPriority(),5);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setUniverCity() throws Exception {
        application.setUniverCity("city");
        assertEquals(application.getUniverCity(),"city");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getUniverCity() throws Exception {
        application.setUniverCity("city");
        assertEquals(application.getUniverCity(),"city");
    }
}