package gr.aueb.cf.exercises.ch14.exercises;

public class ValidationUtils {

    private ValidationUtils(){}

    public static boolean isBig (String str) {
        return !str.isEmpty() &&
                str.length() <= 31;
    }

    public static boolean ziwinschenEinUndZen (int num){
        return num > 1 && num < 10;
    }
}
