package ua.nure.brovenko.SummaryTask4.command.admin;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * EditDepartment command test
 * @author Ivan Brovenko
 */
public class EditDepartmentCommandTest {

    /**
     * Command
     */
    private EditDepartmentCommand editDepartmentCommand;

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
        editDepartmentCommand=new EditDepartmentCommand();
        user=new User();
        user.setRole("admin");
    }

    /**
     * Access test for admin role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(editDepartmentCommand.checkAccess(user));
        user.setRole("entrant");
        assertFalse(editDepartmentCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertFalse(editDepartmentCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(editDepartmentCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(editDepartmentCommand.checkAccess(user));
    }

}