package ua.nure.brovenko.SummaryTask4.command.admin;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * Management command test
 * @author Ivan Brovenko
 */
public class ManagementCommandTest {

    /**
     * Command
     */
    private ManagementCommand managementCommand;

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
        managementCommand=new ManagementCommand();
        user=new User();
        user.setRole("admin");
    }

    /**
     * Access test for admin role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(managementCommand.checkAccess(user));
        user.setRole("entrant");
        assertFalse(managementCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertFalse(managementCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(managementCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(managementCommand.checkAccess(user));
    }

}