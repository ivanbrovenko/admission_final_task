package ua.nure.brovenko.SummaryTask4.command.entrant;

import org.junit.Before;
import org.junit.Test;
import ua.nure.brovenko.SummaryTask4.entity.User;

import static org.junit.Assert.*;

/**
 * FileUploading command test
 * @author Ivan Brovenko
 */
public class FileUploadingCommandTest {

    /**
     * Command
     */
    private FileUploadingCommand fileUploadingCommand;

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
        fileUploadingCommand=new FileUploadingCommand();
        user=new User();
    }

    @Test
    public void checkAccess() throws Exception {
        user.setRole("admin");
        assertFalse(fileUploadingCommand.checkAccess(user));
        user.setRole("entrant");
        assertTrue(fileUploadingCommand.checkAccess(user));
        user.setRole("reg_entrant");
        assertTrue(fileUploadingCommand.checkAccess(user));
        user.setRole("admis");
        assertFalse(fileUploadingCommand.checkAccess(user));
        user.setRole(null);
        assertFalse(fileUploadingCommand.checkAccess(user));
    }

}