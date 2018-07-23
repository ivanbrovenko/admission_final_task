package ua.nure.brovenko.SummaryTask4.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Final admission tes
 * @author Ivan Brovenko
 */
public class FinalAdmissionTest {

    /**
     * FinalAdmission test
     */
    private FinalAdmission finalAdmission;

    /**
     * Action before command will be created
     * @throws Exception if something goes wrong
     */
    @Before
    public void defaultConstructorTest() throws Exception {
        finalAdmission=new FinalAdmission();
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getEmail() throws Exception {
        finalAdmission.setEmail("email");
        assertEquals(finalAdmission.getEmail(),"email");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setEmail() throws Exception {
        finalAdmission.setEmail("email");
        assertEquals(finalAdmission.getEmail(),"email");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getEntrantId() throws Exception {
        finalAdmission.setEntrantId(1);
        assertEquals(finalAdmission.getEntrantId(),1);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setEntrantId() throws Exception {
        finalAdmission.setEntrantId(1);
        assertEquals(finalAdmission.getEntrantId(),1);
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getUneiveName() throws Exception {
        finalAdmission.setUneiveName("univer");
        assertEquals(finalAdmission.getUneiveName(),"univer");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setUneiveName() throws Exception {
        finalAdmission.setUneiveName("univer");
        assertEquals(finalAdmission.getUneiveName(),"univer");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getDepartmentName() throws Exception {
        finalAdmission.setDepartmentName("department");
        assertEquals(finalAdmission.getDepartmentName(),"department");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setDepartmentName() throws Exception {
        finalAdmission.setDepartmentName("department");
        assertEquals(finalAdmission.getDepartmentName(),"department");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getPrice() throws Exception {
        finalAdmission.setPrice("f");
        assertEquals(finalAdmission.getPrice(),"f");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setPrice() throws Exception {
        finalAdmission.setPrice("f");
        assertEquals(finalAdmission.getPrice(),"f");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getPriority() throws Exception {
        finalAdmission.setPriority(5);
        assertEquals(finalAdmission.getPriority(),5);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setPriority() throws Exception {
        finalAdmission.setPriority(5);
        assertEquals(finalAdmission.getPriority(),5);
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getId() throws Exception {
        finalAdmission.setId(1);
        assertEquals(finalAdmission.getId(),1);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setId() throws Exception {
        finalAdmission.setId(1);
        assertEquals(finalAdmission.getId(),1);
    }

}