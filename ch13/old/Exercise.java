package gr.aueb.cf.ch13.exercises.old;

import java.util.Scanner;

public class Exercise {
    static Scanner scanner = new Scanner(System.in);
    static double balance = 500;

    public static void main(String[] args) {
        printMenu();
        int choice = -1;

        while (choice != 4) {
            try {
                choice = getChoice();
                System.out.println("You chose option: " + choice);
                callSwitcher(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input, please enter again");
            }
        }
    }

    public static void printMenu(){
        System.out.println("--- Simple Bank Menu ---");
        System.out.println("1 Deposit Money: ");
        System.out.println("2 : Withdraw Money");
        System.out.println("3 : Check Balance");
        System.out.println("4 : exit ");
//        System.out.println("5 : ");
    }

    public static int getChoice(){
        while (true){
            System.out.println("make a choice (1-4)");

            if (scanner.hasNextInt()){
                int result =  scanner.nextInt();
                if (result < 1 || result > 4) {
                    throw new IllegalArgumentException("Choice out of bound");
                }
                return result;
            } else {
                scanner.next();
            }
        }
    }

    public static void callSwitcher(int choice) {
        switch (choice) {
            case 1:
                deposit(50);
                break;
            case 2:
                while (true) {
                    try {
                        withdraw(100);
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println("not enough money or negative amount");
                        return; //to main menu
                    }
                }
                break;
            case 3:
                System.out.printf ("current balance: %.2f \n", balance);
                break;
            case 4:
                System.out.println("Thnx bb");
                break;
            default:
                System.out.println("invalid option");

        }
    }

    public static void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            System.out.println("withdrawal done!");
            System.out.printf ("current balance: %.2f \n", balance);
        } else {
            throw new IllegalArgumentException("Not enough money, try smaller amount");
        }
    }

    public static void deposit(int amount) {
        balance += amount;
        System.out.println("deposit processed");
        System.out.printf ("current balance: %.2f \n", balance);
    }

}
