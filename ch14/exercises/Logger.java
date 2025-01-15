package gr.aueb.cf.exercises.ch14.exercises;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    // Static instance of the class
    private static Logger logSingle = null;

    // Private constructor to prevent instantiation
    private Logger() {}

    // Public method to provide access to the instance
    public static Logger getLog() {
        if (logSingle == null) {
            logSingle = new Logger();
        }
        return logSingle;
    }

    public void logMessage(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy");
        String formated = now.format(formatter);
        System.out.println("current timestamp is" + formated);
    }

    public void logMessage(String message){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy");
        String formated = now.format(formatter);
        System.out.println(message + "current timestamp is" + formated);
    }

    @Override
    public String toString() {
        return "Logger{}";
    }
}