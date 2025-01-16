package gr.aueb.cf.exercises.ch14.exercises;

public class MainStringUtils143 {
    public static void main(String[] args) {
        String evenWord = "abcdefghijklmnopqrstuvwx";  // Length = 24 (even)
        System.out.println("Reversed even-length word: Expected Output: xwvutsrqponmlkjihgfedcba: " + StringUtils.reverce(evenWord));

        String oddWord = "abcdefghijklmno";  // Length = 15 (odd)
        System.out.println("Reversed odd-length word: Expected Output: onmlkjihgfedcba: " + StringUtils.reverce(oddWord));

        String uppercasing = "hElLo WoRlD!!...";
        System.out.println("Expect \"HELLO WORLD!!...\" " + StringUtils.toUpper(uppercasing));

        String palindrome = "A man, a plan, a canal, Panama!";
        String notAPalindrome = "this is not a palindrome";
        System.out.println(StringUtils.isPalindrome(palindrome));
        System.out.println(StringUtils.isPalindrome(notAPalindrome));


    }
}
