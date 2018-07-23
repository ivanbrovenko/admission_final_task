package ua.nure.brovenko.SummaryTask4.command.entrant;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * Congrats command test
 * @author Ivan Brovenko
 */
public class CongratsCommandTest {

    /**
     * Command
     */
    private CongratsCommand congratsCommand;

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
        congratsCommand=new CongratsCommand();
        user=new User();
    }

    /**
     * Access test for entrant role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        user.setRole("admin");
        assertFalse(congratsCommand.checkAccess(user));
        user.setRole("entrant");
        assertTrue(congratsCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertTrue(congratsCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(congratsCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(congratsCommand.checkAccess(user));
    }

}