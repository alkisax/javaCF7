package gr.aueb.cf.ch10;

import java.util.Scanner;

public class ArmstrongAlk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 9474;
        int sum = 0;
        int numberOfDigits;
        String subStr;
        int tempDigit;

        System.out.println("Please enter a number (integer)");
        num = scanner.nextInt();


        String numberStr = Integer.toString(num);
        numberOfDigits = numberStr.length();

        for (int i = 0; i < numberStr.length(); i++){
            subStr =  numberStr.substring(i, i + 1);
            tempDigit = Integer.valueOf(subStr);
            sum += Math.pow(tempDigit, numberOfDigits);
        }
        System.out.println("sum = " + sum);
        if (sum == num) {
            System.out.println("num " + num + " is an Armstong number");
        } else {
            System.out.println("num " + num + " is not an Armstong number");
        }
    }
}
