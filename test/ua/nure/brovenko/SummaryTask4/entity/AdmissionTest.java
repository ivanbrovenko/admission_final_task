package ua.nure.brovenko.SummaryTask4.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Admission test
 * @author Ivan Brovenko
 */
public class AdmissionTest {

    /**
     * Admission object
     */
    private Admission admission;

    /**
     * Action before command will be created
     * @throws Exception if something goes wrong
     */
    @Before
    public void defaultConstructorTest() throws Exception {
        admission=new Admission();
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getId() throws Exception {
        admission.setId(1);
        assertEquals(admission.getId(),1);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setId() throws Exception {
        admission.setId(1);
        assertEquals(admission.getId(),1);
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getEmail() throws Exception {
        admission.setEmail("email");
        assertEquals(admission.getEmail(),"email");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setEmail() throws Exception {
        admission.setEmail("email");
        assertEquals(admission.getEmail(),"email");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getFinalMark() throws Exception {
        admission.setFinalMark(200);
        assertEquals(admission.getFinalMark(),200);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setFinalMark() throws Exception {
        admission.setFinalMark(200);
        assertEquals(admission.getFinalMark(),200);
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getApplications() throws Exception {
        admission.setApplications(5);
        assertEquals(admission.getApplications(),5);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setApplications() throws Exception {
        admission.setApplications(5);
        assertEquals(admission.getApplications(),5);
    }

}