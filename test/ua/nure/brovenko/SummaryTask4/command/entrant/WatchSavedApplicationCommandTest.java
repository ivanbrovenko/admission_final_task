package ua.nure.brovenko.SummaryTask4.command.entrant;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * WatchSavedApplication command test
 * @author Ivan Brovenko
 */
public class WatchSavedApplicationCommandTest {

    /**
     * Command
     */
    private WatchSavedApplicationCommand watchSavedApplicationCommand;

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
        watchSavedApplicationCommand=new WatchSavedApplicationCommand();
        user=new User();
    }

    /**
     * Access test for entrant role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        user.setRole("admin");
        assertFalse(watchSavedApplicationCommand.checkAccess(user));
        user.setRole("entrant");
        assertTrue(watchSavedApplicationCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertTrue(watchSavedApplicationCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(watchSavedApplicationCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(watchSavedApplicationCommand.checkAccess(user));
    }

}