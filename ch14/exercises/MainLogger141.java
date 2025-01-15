package gr.aueb.cf.exercises.ch14.exercises;

public class MainLogger141 {
    public static void main(String[] args) {
        Logger logger = Logger.getLog();

        System.out.println("without message");
        logger.logMessage();
        System.out.println("with Hello world! message");
        logger.logMessage("Hello world!");
        try {
            Logger logger2 = Logger.getLog();
            if (logger == logger2) {
                System.out.println("Logger1 and Logger2 are the same instance.");
            } else {
                System.out.println("Logger1 and Logger2 are different instances.");
            }

        } catch (Exception e) {
            System.err.println("tried to create second instance");
        }
    }

}
