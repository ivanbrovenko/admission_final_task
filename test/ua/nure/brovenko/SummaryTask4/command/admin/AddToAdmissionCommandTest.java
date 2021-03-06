package ua.nure.brovenko.SummaryTask4.command.admin;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * AddToAdmission command test
 * @author Ivan Brovenko
 */
public class AddToAdmissionCommandTest {

    /**
     * Command
     */
    private AddToAdmissionCommand addToAdmissionCommand;

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
        addToAdmissionCommand=new AddToAdmissionCommand();
        user=new User();
        user.setRole("admin");
    }

    /**
     * Access test for admin role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(addToAdmissionCommand.checkAccess(user));
        user.setRole("entrant");
        assertFalse(addToAdmissionCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertFalse(addToAdmissionCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(addToAdmissionCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(addToAdmissionCommand.checkAccess(user));
    }

}