package ua.nure.brovenko.SummaryTask4.command.admin;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * EntrantDepartment command test
 * @author Ivan Brovenko
 */
public class EntrantDepartmentsCommandTest {

    /**
     * Command
     */
    private EntrantDepartmentsCommand entrantDepartmentsCommand;

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
        entrantDepartmentsCommand=new EntrantDepartmentsCommand();
        user=new User();
        user.setRole("admin");
    }

    /**
     * Access test for admin role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(entrantDepartmentsCommand.checkAccess(user));
        user.setRole("entrant");
        assertFalse(entrantDepartmentsCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertFalse(entrantDepartmentsCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(entrantDepartmentsCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(entrantDepartmentsCommand.checkAccess(user));
    }

}