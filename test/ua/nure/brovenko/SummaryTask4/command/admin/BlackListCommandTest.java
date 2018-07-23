package ua.nure.brovenko.SummaryTask4.command.admin;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * BlockList command test
 * @author Ivan Brovenko
 */
public class BlackListCommandTest {

    /**
     * Command
     */
    private BlackListCommand blackListCommand;

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
        blackListCommand=new BlackListCommand();
        user=new User();
        user.setRole("admin");
    }

    /**
     * Access test for admin role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(blackListCommand.checkAccess(user));
        user.setRole("entrant");
        assertFalse(blackListCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertFalse(blackListCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(blackListCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(blackListCommand.checkAccess(user));
    }

}