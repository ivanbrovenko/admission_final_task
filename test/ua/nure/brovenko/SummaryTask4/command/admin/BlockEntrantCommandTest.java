package ua.nure.brovenko.SummaryTask4.command.admin;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.Univer;
import ua.nure.brovenko.SummaryTask4.entity.User;

import java.util.concurrent.BlockingQueue;

import static org.junit.Assert.*;

/**
 * BlockEntrant command test
 * @author Ivan Brovenko
 */
public class BlockEntrantCommandTest {

    /**
     * Command
     */
    private BlockEntrantCommand blockEntrantCommand;

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
        blockEntrantCommand=new BlockEntrantCommand();
        user=new User();
        user.setRole("admin");
    }

    /**
     * Access test for admin role
     * @throws Exception if something goes wrong
     */
    @Test
    public void checkAccess() throws Exception {
        assertTrue(blockEntrantCommand.checkAccess(user));
        user.setRole("entrant");
        assertFalse(blockEntrantCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertFalse(blockEntrantCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(blockEntrantCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(blockEntrantCommand.checkAccess(user));
    }

}