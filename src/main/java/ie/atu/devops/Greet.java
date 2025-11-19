package ie.atu.devops;

import java.util.logging.Logger;

/**
 * @author ErenDerinbay
 * @version 1.0
 */
public class Greet {
    private static final Logger logger = Logger.getLogger(Greet.class.getName());

    /**
     * @param param An integer value. If 1, returns "Hello"; otherwise returns "Goodbye".
     * @return A string representing the greeting ("Hello" or "Goodbye").
     */
    public static String greet(int param) {
        logger.info("greet() called with param = " + param);

        try {
            String result = (param == 1) ? "Hello!" : "Goodbye!";
            logger.fine("Result = " + result);
            return result;
        } catch (Exception ex) {
            logger.warning("Error in greet(): " + ex.toString());
            return "";
        }
    }
}
