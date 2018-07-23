package ua.nure.brovenko.SummaryTask4.command.entrant;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * WatchInformantin command test
 * @author Ivan Brovenko
 */
public class WatchInformationCommandTest {

    /**
     * Command
     */
    private WatchInformationCommand watchInformationCommand;

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
        watchInformationCommand=new WatchInformationCommand();
        user=new User();
    }

    /**
     * Access test for entrant role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        user.setRole("admin");
        assertFalse(watchInformationCommand.checkAccess(user));
        user.setRole("entrant");
        assertTrue(watchInformationCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertTrue(watchInformationCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(watchInformationCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(watchInformationCommand.checkAccess(user));
    }

}