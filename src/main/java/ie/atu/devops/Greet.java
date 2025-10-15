package ie.atu.devops;

/**
 * @author ErenDerinbay
 * @version 1.0
 */
public class Greet {
    /**
     * @param param An integer value. If 1, returns "Hello"; otherwise returns "Goodbye".
     * @return A string representing the greeting ("Hello" or "Goodbye").
     */
    public static String greet(int param) {
        if (param == 1) {
            return "Hello";
        } else {
            return "Goodbye";
        }
    }
}
