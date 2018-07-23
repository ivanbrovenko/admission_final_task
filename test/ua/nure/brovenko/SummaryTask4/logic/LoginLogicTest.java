package ua.nure.brovenko.SummaryTask4.logic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Login logic test
 * @author Ivan Brovenko
 */
public class LoginLogicTest {

    @Test
    public void checkLogin() throws Exception {
        assertNull(LoginLogic.checkLogin(null,null));
    }

}