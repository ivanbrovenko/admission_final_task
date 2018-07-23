package ua.nure.brovenko.SummaryTask4.command.admin;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * DepartmentManagement command test
 * @author Ivan Brovenko
 */
public class DepartmentManagementCommandTest {

    /**
     * Command
     */
    private DepartmentManagementCommand departmentManagementCommand;

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
        departmentManagementCommand=new DepartmentManagementCommand();
        user=new User();
        user.setRole("admin");
    }

    /**
     * Access test for admin role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(departmentManagementCommand.checkAccess(user));
        user.setRole("entrant");
        assertFalse(departmentManagementCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertFalse(departmentManagementCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(departmentManagementCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(departmentManagementCommand.checkAccess(user));
    }

}