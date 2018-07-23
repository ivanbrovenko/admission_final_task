package ua.nure.brovenko.SummaryTask4.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Subject test
 * @author Ivan Brovenko
 */
public class SubjectTest {

    /**
     * Subject object
     */
    private Subject subject;

    /**
     * Action before command will be created
     * @throws Exception if something goes wrong
     */
    @Before
    public void defaultConstructorTest() throws Exception {
        subject=new Subject();
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getName() throws Exception {
        subject.setName("name");
        assertEquals(subject.getName(),"name");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setName() throws Exception {
        subject.setName("name");
        assertEquals(subject.getName(),"name");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getMark() throws Exception {
        subject.setMark(12);
        assertEquals(subject.getMark(),12);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setMark() throws Exception {
        subject.setMark(12);
        assertEquals(subject.getMark(),12);
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getId() throws Exception {
        subject.setId(1);
        assertEquals(subject.getId(),1);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setId() throws Exception {
        subject.setId(1);
        assertEquals(subject.getId(),1);
    }

}