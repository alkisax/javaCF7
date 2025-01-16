package gr.aueb.cf.exercises.ch14.exercises;

public class MainValidation144 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 55;
        String pass = "pass";
        String notPass = "this i think is big enough so as not to pas nut for sure 1234567890";

        System.out.println("expect true: " + ValidationUtils.isBig(pass));
        System.out.println("expect false: " + ValidationUtils.isBig(notPass));
        System.out.println(("Expect true: " + ValidationUtils.ziwinschenEinUndZen(num1)));
        System.out.println("Expect false: " + ValidationUtils.ziwinschenEinUndZen(num2));
    }


}
