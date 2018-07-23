package ua.nure.brovenko.SummaryTask4.command.admin;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * SendEmail command test
 * @author Ivan Brovenko
 */
public class SendEmailCommandTest {

    /**
     * Command
     */
    private SendEmailCommand sendEmailCommand;

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
        sendEmailCommand=new SendEmailCommand();
        user=new User();
        user.setRole("admin");
    }

    /**
     * Access test for admin role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(sendEmailCommand.checkAccess(user));
        user.setRole("entrant");
        assertFalse(sendEmailCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertFalse(sendEmailCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(sendEmailCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(sendEmailCommand.checkAccess(user));
    }

}