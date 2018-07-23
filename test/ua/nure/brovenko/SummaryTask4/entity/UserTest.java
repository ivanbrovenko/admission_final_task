package ua.nure.brovenko.SummaryTask4.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * User test
 * @author Ivan Brovenko
 */
public class UserTest {

    /**
     * User object
     */
    private User user;

    /**
     * Action before command will be created
     * @throws Exception if something goes wrong
     */
    @Before
    public void defaultConstructorTest() throws Exception {
        user=new User();
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getId() throws Exception {
        user.setId(1);
        assertEquals(user.getId(),1);
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setId() throws Exception {
        user.setId(1);
        assertEquals(user.getId(),1);
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getEmail() throws Exception {
        user.setEmail("email");
        assertEquals(user.getEmail(),"email");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setEmail() throws Exception {
        user.setEmail("email");
        assertEquals(user.getEmail(),"email");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getPassword() throws Exception {
        user.setPassword("password");
        assertEquals(user.getPassword(),"password");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setPassword() throws Exception {
        user.setPassword("password");
        assertEquals(user.getPassword(),"password");
    }

    /**
     * Getter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void getRole() throws Exception {
        user.setRole("role");
        assertEquals(user.getRole(),"role");
    }

    /**
     * Setter test
     * @throws Exception if something goes wrong
     */
    @Test
    public void setRole() throws Exception {
        user.setRole("role");
        assertEquals(user.getRole(),"role");
    }

}