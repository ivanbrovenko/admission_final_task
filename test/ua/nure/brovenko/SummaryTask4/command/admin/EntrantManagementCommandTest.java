package ua.nure.brovenko.SummaryTask4.command.admin;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * EntrantManagement command test
 * @author Ivan Brovenko
 */
public class EntrantManagementCommandTest {

    /**
     * Command
     */
    private EntrantManagementCommand entrantManagementCommand;

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
        entrantManagementCommand=new EntrantManagementCommand();
        user=new User();
        user.setRole("admin");
    }

    /**
     * Access test for admin role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(entrantManagementCommand.checkAccess(user));
        user.setRole("entrant");
        assertFalse(entrantManagementCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertFalse(entrantManagementCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(entrantManagementCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(entrantManagementCommand.checkAccess(user));
    }

}