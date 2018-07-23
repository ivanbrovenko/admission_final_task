package ua.nure.brovenko.SummaryTask4.command.entrant;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * SaveZno command test
 * @author Ivan Brovenko
 */
public class SaveZnoCommandTest {

    /**
     * Command
     */
    private SaveZnoCommand saveZnoCommand;

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
        saveZnoCommand=new SaveZnoCommand();
        user=new User();
    }

    /**
     * Access test for entrant role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        user.setRole("admin");
        assertFalse(saveZnoCommand.checkAccess(user));
        user.setRole("entrant");
        assertTrue(saveZnoCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertTrue(saveZnoCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(saveZnoCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(saveZnoCommand.checkAccess(user));
    }

}