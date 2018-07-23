package ua.nure.brovenko.SummaryTask4.command.admin;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * EntrantInfo command test
 * @author Ivan Brovenko
 */
public class EntrantInfoCommandTest {

    /**
     * Command
     */
    private EntrantInfoCommand entrantInfoCommand;

    /**
     * User object
     */
    private User user;

    /**
     * Action before command will be created
     * @throws Exception if something goes wrong
     */
    @Before
    public void setUp() throws Exception {
        entrantInfoCommand=new EntrantInfoCommand();
        user=new User();
        user.setRole("admin");
    }

    /**
     * Access test for admin role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(entrantInfoCommand.checkAccess(user));
        user.setRole("entrant");
        assertFalse(entrantInfoCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertFalse(entrantInfoCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(entrantInfoCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(entrantInfoCommand.checkAccess(user));
    }

}