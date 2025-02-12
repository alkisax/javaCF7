package gr.aueb.cf.exercises.ch19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

//create double linked list
//read from file
public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\IdeaProjects\\CF7-TestBed\\src\\gr\\aueb\\cf\\exercises\\ch19\\lorem.txt";
        File fd = new File(path);
        DoublyLinkedLIst<Character> doubleList = new DoublyLinkedLIst<>();

        int count;
        char ch;
        HashMap<Character, Integer> frequency = new HashMap<Character, Integer>();
        try (Scanner in = new Scanner(fd)){
            in.useDelimiter("");
            while (in.hasNext()) {
                ch = in.next().charAt(0);
                System.out.print(ch);
                doubleList.insertLast(ch);

                frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
            }

        } catch (FileNotFoundException  e) {
            System.err.println("error file not found");
            e.printStackTrace();
        }

    }
}
