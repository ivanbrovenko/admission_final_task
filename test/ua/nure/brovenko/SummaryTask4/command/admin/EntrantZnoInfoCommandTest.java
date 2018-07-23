package ua.nure.brovenko.SummaryTask4.command.admin;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * EntrantZnoInfo command test
 * @author Ivan Brovenko
 */
public class EntrantZnoInfoCommandTest {

    /**
     * Command
     */
    private EntrantZnoInfoCommand entrantZnoInfoCommand;

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
        entrantZnoInfoCommand=new EntrantZnoInfoCommand();
        user=new User();
        user.setRole("admin");
    }

    /**
     * Access test for admin role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(entrantZnoInfoCommand.checkAccess(user));
        user.setRole("entrant");
        assertFalse(entrantZnoInfoCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertFalse(entrantZnoInfoCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(entrantZnoInfoCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(entrantZnoInfoCommand.checkAccess(user));
    }

}