package gr.aueb.cf.exercises.ch14.exercises;

public class StringUtils {

    private StringUtils(){}

    public static String reverce (String str) {
        char[] arrStr = new char[str.length()];
        try {
            for (int c = 0; c < str.length(); c++){
                arrStr[str.length() - 1 - c] = str.charAt(c);
            }
            return new String(arrStr);
        } catch (Exception e) {
            System.err.println("error");
            return "error";
        }
    }

    public static String toUpper (String str) {
        char[] arrStr = new char[str.length()];
        try {
            for (int i = 0; i < str.length(); i++) {
                arrStr[i] = str.charAt(i);
                if (Character.isLetter(arrStr[i]) &&
                    arrStr[i] >= 'a' &&
                    arrStr[i] <= 'z'
                ) {
                    arrStr[i] -= 32;
                }
            }
            return new String(arrStr);
        } catch (Exception e) {
            System.err.println("error");
            return "error";
        }
    }

    public static Boolean isPalindrome (String str) {
        str = StringUtils.toUpper(str);
        char[] arrStr = new char[str.length()];
        StringBuilder cleaned = new StringBuilder();

        try {
            for (int i = 0; i < str.length(); i++){
                arrStr[i] = str.charAt(i);
                if (Character.isLetter(arrStr[i])){
                    cleaned.append(arrStr[i]);
                }
            }
            String cleanedStr = new String(cleaned);
            System.out.println("cleaned Str: " + cleanedStr);

            char[] cleanArrStr = new char[cleanedStr.length()];
            for (int i = 0; i < cleanedStr.length(); i++) {
                cleanArrStr[i] = cleanedStr.charAt(i);
                if (cleanArrStr[i] != cleanedStr.charAt(cleanedStr.length() - i -1)){
                    System.out.println("not a palindrome");
                    return false;
                }
            }
            String reversed = new String(cleanArrStr);
            System.out.println("reversed: " + reversed);
            return true;
        } catch (Exception e) {
            System.err.println("error");
            return false;
        }
    }

}
