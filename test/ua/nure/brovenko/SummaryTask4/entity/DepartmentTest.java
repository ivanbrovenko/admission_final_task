package ua.nure.brovenko.SummaryTask4.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Department test
 * @author Ivan Brovenko
 */
public class DepartmentTest {

    /**
     * Department object
     */
    private Department department;

    /**
     * Action before command will be created
     * @throws Exception if something goes wrong
     */
    @Before
    public void defaultConstructorTest() throws Exception {
        department=new Department();
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getId() throws Exception {
        department.setId(1);
        assertEquals(department.getId(),1);
    }

    @Test
    public void setId() throws Exception {
        department.setId(1);
        assertEquals(department.getId(),1);
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getName() throws Exception {
        department.setName("name");
        assertEquals(department.getName(),"name");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setName() throws Exception {
        department.setName("name");
        assertEquals(department.getName(),"name");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getAllPlaces() throws Exception {
        department.setAllPlaces(100);
        assertEquals(department.getAllPlaces(),100);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setAllPlaces() throws Exception {
        department.setAllPlaces(100);
        assertEquals(department.getAllPlaces(),100);
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getFreePlaces() throws Exception {
        department.setFreePlaces(10);
        assertEquals(department.getFreePlaces(),10);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setFreePlaces() throws Exception {
        department.setFreePlaces(10);
        assertEquals(department.getFreePlaces(),10);
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getUniverName() throws Exception {
        department.setUniverName("univer");
        assertEquals(department.getUniverName(),"univer");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setUniverName() throws Exception {
        department.setUniverName("univer");
        assertEquals(department.getUniverName(),"univer");
    }

}