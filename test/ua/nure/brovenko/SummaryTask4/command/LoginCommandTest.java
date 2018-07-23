package ua.nure.brovenko.SummaryTask4.command;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * Login command test
 * @author Ivan Brovenko
 */
public class LoginCommandTest {

    /**
     * Command
     */
    private LoginCommand loginCommand;

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
        loginCommand=new LoginCommand();
        user=new User();
    }

    /**
     * Access test for every role
     * should always return true
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(loginCommand.checkAccess(user));
        user.setRole("admin");
        assertTrue(loginCommand.checkAccess(user));
        user.setRole("entrant");
        assertTrue(loginCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertTrue(loginCommand.checkAccess(user));
        user.setRole("admis");
        assertTrue(loginCommand.checkAccess(user));

    }

}