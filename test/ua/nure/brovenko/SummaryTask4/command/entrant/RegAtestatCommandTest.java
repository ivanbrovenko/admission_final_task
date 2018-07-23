package ua.nure.brovenko.SummaryTask4.command.entrant;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * RegAtestat command test
 * @author Ivan Brovenko
 */
public class RegAtestatCommandTest {

    /**
     * Command
     */
    private RegAtestatCommand regAtestatCommand;

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
        regAtestatCommand=new RegAtestatCommand();
        user=new User();
    }

    /**
     * Access test for entrant role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        user.setRole("admin");
        assertFalse(regAtestatCommand.checkAccess(user));
        user.setRole("entrant");
        assertTrue(regAtestatCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertTrue(regAtestatCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(regAtestatCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(regAtestatCommand.checkAccess(user));
    }

}