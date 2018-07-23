package ua.nure.brovenko.SummaryTask4.command.entrant;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * Account command test
 * @author Ivan Brovenko
 */
public class AccountCommandTest {

    /**
     * Command
     */
    private AccountCommand accountCommand;

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
        accountCommand=new AccountCommand();
        user=new User();
    }

    /**
     * Access test for entrant role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        user.setRole("admin");
        assertFalse(accountCommand.checkAccess(user));
        user.setRole("entrant");
        assertTrue(accountCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertTrue(accountCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(accountCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(accountCommand.checkAccess(user));
    }

}