package gr.aueb.cf.ch13.exercises.old;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        boolean[] predicates = new boolean[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("give 6 nums between 1-49 (enter)");
        for (int i = 0; i < 6; i++) {
            System.out.println("give a number");
            arr[i] = scanner.nextInt();
        }

        predicates[0] = noMoreThan3Even(arr);
        System.out.println("noMoreThan3Even " + predicates[0]);

        predicates[1] = noMoreThan3Odd(arr);
        System.out.println("noMoreThan3Odd " + predicates[1]);

        predicates[2] = noMoreThan3Contineus(arr);
        System.out.println("noMoreThan3Contineus " + predicates[2]);

        predicates[3] = noSameFinal(arr);
        System.out.println(" Δεν έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα " + predicates[3]);

        predicates[4] = noSameDec(arr);
        System.out.println("Δεν έχει πάνω από 3 αριθμούς στην ίδια δεκάδα " + predicates[4]);

        boolean result = true;
        for (boolean predicate: predicates) {
            if (predicate == false) {
                result = false;
                break;
            }
        }
        System.out.println(result);


    }
    public static boolean noMoreThan3Even (int[] arr) {
        boolean predicate = false;
        int count = 0;
        for (int el: arr) {
            if (el % 2 == 0) {
                count++;
            }
        }
        if (count <= 3) {
            predicate = true;
        }
        return predicate;
    }

    public static boolean noMoreThan3Odd (int[] arr) {
        boolean predicate = false;
        int count = 0;
        for (int el: arr) {
            if (el % 2 == 1) {
                count++;
            }
        }
        if (count <= 3) {
            predicate = true;
        }
        return predicate;
    }

    public static boolean noMoreThan3Contineus (int[] arr) {

        for (int i = 1; i < arr.length - 1; i++) {
//            if ( arr[i] == arr[i - 1] + 1 && arr[i] == arr[i + 1] -1) {
            if (arr[i] + 1 == arr[i + 1] && arr[i + 1] + 1 == arr[i + 2]){
                return false;
            }
        }
        return true;
    }

    public static boolean noSameFinal (int[] arr) {
        int count = 0;
        int[] finals = new int[6];
        for (int i = 0; i < arr.length; i++) {
            finals[i] = arr[i] % 10;
        }

        for (int el: finals) {
            count = 0;
            for (int test: finals) {
                if (el == test) {
                    count++;
                }
            }
            if (count > 3) {
                return false;
            }
        }
        return true;
    }

    public static boolean noSameDec (int[] arr) {
        int count = 0;
        int dec = 0;
        for (int el: arr) {
            count = 0;
            dec = el / 10;
            for (int test: arr) {
                if (dec == test / 10) {
                    count++;
                }
            }
            if (count > 3){
                return false;
            }
        }
        return true;
    }

}
