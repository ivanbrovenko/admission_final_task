package ua.nure.brovenko.SummaryTask4.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Entrant test
 * @author Ivan Brovenko
 */
public class EntrantTest {

    /**
     * Entrant object
     */
    Entrant entrant;

    /**
     * Action before command will be created
     * @throws Exception if something goes wrong
     */
    @Before
    public void defaultConstructorTest() throws Exception {
        entrant=new Entrant();
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getId() throws Exception {
        entrant.setId(1);
        assertEquals(entrant.getId(),1);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setId() throws Exception {
        entrant.setId(1);
        assertEquals(entrant.getId(),1);
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getFirstName() throws Exception {
        entrant.setFirstName("fName");
        assertEquals(entrant.getFirstName(),"fName");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setFirstName() throws Exception {
        entrant.setFirstName("fName");
        assertEquals(entrant.getFirstName(),"fName");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getLastName() throws Exception {
        entrant.setLastName("lName");
        assertEquals(entrant.getLastName(),"lName");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setLastName() throws Exception {
        entrant.setLastName("lName");
        assertEquals(entrant.getLastName(),"lName");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getPatronymic() throws Exception {
        entrant.setPatronymic("middleName");
        assertEquals(entrant.getPatronymic(),"middleName");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setPatronymic() throws Exception {
        entrant.setPatronymic("middleName");
        assertEquals(entrant.getPatronymic(),"middleName");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getCity() throws Exception {
        entrant.setCity("city");
        assertEquals(entrant.getCity(),"city");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setCity() throws Exception {
        entrant.setCity("city");
        assertEquals(entrant.getCity(),"city");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getRegion() throws Exception {
        entrant.setRegion("region");
        assertEquals(entrant.getRegion(),"region");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setRegion() throws Exception {
        entrant.setRegion("region");
        assertEquals(entrant.getRegion(),"region");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getSchool() throws Exception {
        entrant.setSchool("school");
        assertEquals(entrant.getSchool(),"school");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setSchool() throws Exception {
        entrant.setSchool("school");
        assertEquals(entrant.getSchool(),"school");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getEmail() throws Exception {
        entrant.setEmail("email");
        assertEquals(entrant.getEmail(),"email");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setEmail() throws Exception {
        entrant.setEmail("email");
        assertEquals(entrant.getEmail(),"email");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getPassword() throws Exception {
        entrant.setPassword("password");
        assertEquals(entrant.getPassword(),"password");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setPassword() throws Exception {
        entrant.setPassword("password");
        assertEquals(entrant.getPassword(),"password");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getRole() throws Exception {
        entrant.setRole("role");
        assertEquals(entrant.getRole(),"role");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setRole() throws Exception {
        entrant.setRole("role");
        assertEquals(entrant.getRole(),"role");
    }
}