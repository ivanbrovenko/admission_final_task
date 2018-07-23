package ua.nure.brovenko.SummaryTask4.command;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * EmailSignUp command test
 * @author Ivan Brovenko
 */
public class EmailSignUpCommandTest {

    /**
     * Command
     */
    private EmailSignUpCommand emailSignUpCommand;

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
        emailSignUpCommand=new EmailSignUpCommand();
        user=new User();
    }

    /**
     * Access test for every role
     * should always return true
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(emailSignUpCommand.checkAccess(user));
        user.setRole("admin");
        assertTrue(emailSignUpCommand.checkAccess(user));
        user.setRole("entrant");
        assertTrue(emailSignUpCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertTrue(emailSignUpCommand.checkAccess(user));
        user.setRole("admis");
        assertTrue(emailSignUpCommand.checkAccess(user));

    }

}