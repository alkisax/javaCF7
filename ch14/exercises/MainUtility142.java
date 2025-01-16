package gr.aueb.cf.exercises.ch14.exercises;

public class MainUtility142 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};
        int[] emptyArray = {};
        int[] nullArray = null;
        System.out.println("expect 16 Square of 4: " + MathHelper142.square(4));
        System.out.println("expect 8 Max value: " + MathHelper142.max(numbers));
        System.out.println("expect 1 Min value: " + MathHelper142.min(numbers));
        System.out.println("expect 3.8 Mean value: " + MathHelper142.mean(numbers));

        System.out.println("expect -1 Mean of empty array: " + MathHelper142.mean(emptyArray)); // Expected: NaN
        System.out.println("Mean of null array: " + MathHelper142.mean(nullArray));  // Expected: NaN
    }
}
