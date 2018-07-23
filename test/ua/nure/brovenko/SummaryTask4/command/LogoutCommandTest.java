package ua.nure.brovenko.SummaryTask4.command;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * Logout command test
 * @author Ivan Brovenko
 */
public class LogoutCommandTest {

    /**
     * Command
     */
    private LogoutCommand logoutCommand;

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
        logoutCommand=new LogoutCommand();
        user=new User();
    }

    /**
     * Access test for every role
     * should always return true
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(logoutCommand.checkAccess(user));
        user.setRole("admin");
        assertTrue(logoutCommand.checkAccess(user));
        user.setRole("entrant");
        assertTrue(logoutCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertTrue(logoutCommand.checkAccess(user));
        user.setRole("admis");
        assertTrue(logoutCommand.checkAccess(user));

    }

}