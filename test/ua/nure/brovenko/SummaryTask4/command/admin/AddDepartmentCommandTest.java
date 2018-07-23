package ua.nure.brovenko.SummaryTask4.command.admin;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * AddDepartment command test
 * @author Ivan Brovenko
 */
public class AddDepartmentCommandTest {

    /**
     * Command
     */
    private AddDepartmentCommand addDepartmentCommand;

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
        addDepartmentCommand=new AddDepartmentCommand();
        user=new User();
        user.setRole("admin");

    }

    /**
     * Access test for admin role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(addDepartmentCommand.checkAccess(user));
        user.setRole("entrant");
        assertFalse(addDepartmentCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertFalse(addDepartmentCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(addDepartmentCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(addDepartmentCommand.checkAccess(user));
    }

}