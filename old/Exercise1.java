package gr.aueb.cf.ch13.exercises.old;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;

        while (true) {
            printMenu();
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("give number of stars");
                    n = scan.nextInt();
                    verticalStar(n);
                    break;
                case 2:
                    System.out.println("give number of stars");
                    n = scan.nextInt();
                    horizontalStar(n);
                    break;
                case 3:
                    System.out.println("give number of stars");
                    n = scan.nextInt();
                    squareStar(n);
                    break;
                case 4:
                    System.out.println("give number of stars");
                    n = scan.nextInt();
                    assendingStar(n);
                    break;
                case 5:
                    System.out.println("give number of stars");
                    n = scan.nextInt();
                    dissendingStar(n);
                    break;
                case 6:
                    System.out.println("bb");
                    return;
            }
        }
    }

    public static void printMenu() {
            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
            System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
            System.out.println("6. Έξοδος από το πρόγραμμα");
        }

    public static void horizontalStar(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void verticalStar(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
        System.out.println();
    }

    public static void squareStar(int n) {
        for (int i = 0; i < n; i++) {
            horizontalStar(n);
        }
        System.out.println();
    }

    public static void assendingStar(int n) {
        for (int i = 1; i <= n; i++) {
            horizontalStar(i);
        }
        System.out.println();
    }

    public static void dissendingStar(int n) {
        for (int i = n; i >= 0; i--) {
            horizontalStar(i);
        }
        System.out.println();
    }
}
