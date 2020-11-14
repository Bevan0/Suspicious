package suspicious;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Suspicious {

    public static Logger logger;
    public static String[] args;

    public static void main(String[] args) {
        // Program starts here
        System.out.println("Suspicious Among Us Server");

        Suspicious.logger = Logger.getLogger("Suspicious");
        Suspicious.args = args;

        logger.log(Level.INFO, "Server starting...");
    }
}
