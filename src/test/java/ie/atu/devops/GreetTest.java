package ie.atu.devops;

import junit.framework.TestCase;

public class GreetTest extends TestCase {

    public void testGreetHello() {
        assertEquals("Hello!", Greet.greet(1));
    }

    public void testGreetGoodbye() {
        assertEquals("Goodbye!", Greet.greet(2));
    }
}