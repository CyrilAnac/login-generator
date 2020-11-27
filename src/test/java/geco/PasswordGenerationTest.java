package geco;

import junit.framework.TestCase;

public class PasswordGenerationTest extends TestCase {


    public void testGetRandomPassword() {
        PasswordGeneration pg = new PasswordGeneration();
        System.out.println(pg.getRandomPassword());
        assertEquals("Number of character should be 8", 8, pg.getRandomPassword().length());
    }
}