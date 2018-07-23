package ua.nure.brovenko.SummaryTask4.command.admin;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * UnblockEntrant command test
 * @author Ivan Brovenko
 */
public class UnblockEntrantCommandTest {

    /**
     * Command
     */
    private UnblockEntrantCommand unblockEntrantCommand;

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
        unblockEntrantCommand=new UnblockEntrantCommand();
        user=new User();
        user.setRole("admin");
    }

    /**
     * Access test for admin role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(unblockEntrantCommand.checkAccess(user));
        user.setRole("entrant");
        assertFalse(unblockEntrantCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertFalse(unblockEntrantCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(unblockEntrantCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(unblockEntrantCommand.checkAccess(user));
    }

}