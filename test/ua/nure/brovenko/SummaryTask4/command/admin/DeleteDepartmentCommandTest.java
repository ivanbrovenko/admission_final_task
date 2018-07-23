package ua.nure.brovenko.SummaryTask4.command.admin;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * DeleteDepartment command test
 * @author Ivan Brovenko
 */
public class DeleteDepartmentCommandTest {

    /**
     * Command
     */
    private DeleteDepartmentCommand deleteDepartmentCommand;

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
        deleteDepartmentCommand=new DeleteDepartmentCommand();
        user=new User();
        user.setRole("admin");
    }

    /**
     * Access test for admin role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(deleteDepartmentCommand.checkAccess(user));
        user.setRole("entrant");
        assertFalse(deleteDepartmentCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertFalse(deleteDepartmentCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(deleteDepartmentCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(deleteDepartmentCommand.checkAccess(user));
    }

}