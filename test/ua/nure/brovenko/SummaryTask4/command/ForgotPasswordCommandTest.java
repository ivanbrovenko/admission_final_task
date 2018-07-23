package ua.nure.brovenko.SummaryTask4.command;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * ForgotPassword command test
 * @author Ivan Brovenko
 */
public class ForgotPasswordCommandTest {

    /**
     * Command
     */
    private ForgotPasswordCommand forgotPasswordCommand;

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
        forgotPasswordCommand=new ForgotPasswordCommand();
        user=new User();
    }

    /**
     * Access test for every role
     * should always return true
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(forgotPasswordCommand.checkAccess(user));
        user.setRole("admin");
        assertTrue(forgotPasswordCommand.checkAccess(user));
        user.setRole("entrant");
        assertTrue(forgotPasswordCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertTrue(forgotPasswordCommand.checkAccess(user));
        user.setRole("admis");
        assertTrue(forgotPasswordCommand.checkAccess(user));
    }

}