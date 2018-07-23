package ua.nure.brovenko.SummaryTask4.command.admin;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * FinalAdmission command test
 * @author Ivan Brovenko
 */
public class FinalAdmissionCommandTest {

    /**
     * Command
     */
    private FinalAdmissionCommand finalAdmissionCommand;

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
        finalAdmissionCommand=new FinalAdmissionCommand();
        user=new User();
        user.setRole("admin");
    }

    /**
     * Access test for admin role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(finalAdmissionCommand.checkAccess(user));
        user.setRole("entrant");
        assertFalse(finalAdmissionCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertFalse(finalAdmissionCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(finalAdmissionCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(finalAdmissionCommand.checkAccess(user));
    }

}