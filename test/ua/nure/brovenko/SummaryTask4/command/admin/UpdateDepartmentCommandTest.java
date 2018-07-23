package ua.nure.brovenko.SummaryTask4.command.admin;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * UpdateDepartment command test
 * @author Ivan Brovenko
 */
public class UpdateDepartmentCommandTest {

    /**
     * Command
     */
    private UpdateDepartmentCommand updateDepartmentCommand;

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
        updateDepartmentCommand=new UpdateDepartmentCommand();
        user=new User();
        user.setRole("admin");
    }

    /**
     * Access test for admin role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(updateDepartmentCommand.checkAccess(user));
        user.setRole("entrant");
        assertFalse(updateDepartmentCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertFalse(updateDepartmentCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(updateDepartmentCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(updateDepartmentCommand.checkAccess(user));
    }

}