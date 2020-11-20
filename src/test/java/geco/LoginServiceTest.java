package geco;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class LoginServiceTest extends TestCase {
    LoginService logS;

    public void setUp(){
        String[] strs = {"log1", "log2", "log3","gol1"};
        logS = new LoginService(strs);

    }

    public void testLoginExists() {
        assertTrue(logS.loginExists("log3"));
    }
    public void testLoginNotExists() {
        assertFalse(logS.loginExists("log4"));
    }

    public void testAddLogin() {
        logS.addLogin("logg");
        logS.addLogin("logg2");
        assertTrue(logS.loginExists("logg2"));
    }

    public void testFindAllLoginsStartingWith() {
        List<String> testLog = logS.findAllLoginsStartingWith("log");
        String[] oracle = {"log1", "log2","log3"};
        assertTrue(testLog.containsAll(Arrays.asList(oracle)));
    }

    public void testFindAllLogins() {
        List<String> testLog = logS.findAllLogins();
        String[] oracle = {"log1", "log2","log3","gol1"};
        assertTrue(testLog.containsAll(Arrays.asList(oracle)));
    }
}