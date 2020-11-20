package geco;

import junit.framework.TestCase;

public class LoginGeneratorTest extends TestCase {
    LoginGenerator logG;

    public void setUp() {
        LoginService logS = new LoginService(new String[] {
                "JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});

        logG = new LoginGenerator(logS);
    }

    public void testGenerateLoginForNomAndPrenom() {
        String res = logG.generateLoginForNomAndPrenom("Durand", "Paul");
        assertEquals("the result should be PDUR", "PDUR", res);
    }

    public void testGenerateLoginForIncrement() {
        String res = logG.generateLoginForNomAndPrenom("Ralling", "John");
        assertEquals("the result should be JRAL2", "JRAL2", res);
    }

    public void testGenerateLoginJROL() {
        String res = logG.generateLoginForNomAndPrenom("Rolling", "Jean");
        assertEquals("the result should be JROL1", "JROL1", res);
    }

    public void testGenerateLoginPDUR() {
        String res = logG.generateLoginForNomAndPrenom("Durand", "Paul");
        assertEquals("the result should be PDUR", "PDUR", res);
    }

}