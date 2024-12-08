package gr.aueb.cf.ch9.exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Exercise91 {
    public static void main(String[] args) {
        String line;
        String[] tokens;
        String toBePrinted;

//        String relativePath = "locations.txt";
        String path = "src/gr/aueb/cf/ch9/exercises/locations.txt";
        String outPath = "src/gr/aueb/cf/ch9/exercises/JSONlocations.txt";
        File fd = new File(path);
        File outFile = new File(outPath);

        try (
                Scanner in = new Scanner(fd);
                PrintStream printStrm = new PrintStream(outFile,StandardCharsets.UTF_8);
        ){
            in.nextLine(); //πηδάμε την πρώτη γραμμή του csv
            while (in.hasNextLine()){
                line = in.nextLine();
                tokens = line.split(",");
//                toBePrinted = "{ location: '" + tokens[0].trim() + "', latitude: " + tokens[1] + ", longitude: " + tokens[2] + " },";
                toBePrinted = String.format("{ location: '%s', latitude: %s, longitude: %s }", tokens[0].trim(), tokens[1].trim(), tokens[2].trim());

                System.out.println(toBePrinted);
                printStrm.println(toBePrinted);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("ERROR");
        }
    }
}
