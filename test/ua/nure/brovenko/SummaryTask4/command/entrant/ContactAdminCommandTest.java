package ua.nure.brovenko.SummaryTask4.command.entrant;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * ContactAdmin command test
 * @author Ivan Brovenko
 */
public class ContactAdminCommandTest {

    /**
     * Command
     */
    private ContactAdminCommand contactAdminCommand;

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
        contactAdminCommand=new ContactAdminCommand();
        user=new User();

    }

    /**
     * Access test for entrant role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        user.setRole("admin");
        assertFalse(contactAdminCommand.checkAccess(user));
        user.setRole("entrant");
        assertTrue(contactAdminCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertTrue(contactAdminCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(contactAdminCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(contactAdminCommand.checkAccess(user));
    }

}