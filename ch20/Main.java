package gr.aueb.cf.exercises.ch20;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> strs = new LinkedList<>();
        // Adding test strings
        strs.add("Password1#");  // Pass
        strs.add("MyPa$$w0rd");  // Pass
        strs.add("A1b2C3d4!");   // Pass
        strs.add("Secure#123");  // Pass
        strs.add("password");    // Fail
        strs.add("PASSWORD1");   // Fail
        strs.add("Pass123");     // Fail
        strs.add("Password!");   // Fail

        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[#?!@$%^&*-]).{8,}$";

        strs.forEach(str -> {
            if (str.matches(pattern)){
                System.out.println(str + " is a VALID password.");
            } else {
                System.out.println(str + " is a NOT a valid password.");
            }
        });

    }
}
