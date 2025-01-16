package gr.aueb.cf.exercises.ch14.exercises;

public class MathHelper142 {

    private MathHelper142(){}

    public static int square (int num) {
        return num * num;
    }

    public static int max (int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int el: arr){
            if (el > max) {
                max = el;
            }
        }
        return max;
    }

    public static int min (int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int el: arr){
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

    public static double mean (int[] arr){
        double mean = 0;
        int sum = 0;
        try {
            if (arr.length > 0) {
                for (int el: arr) {
                    sum += el;
                }
                mean = (double) sum / arr.length;
            } else {
                throw new IllegalArgumentException ("arr is empty");
            }
            return mean;
        } catch (IllegalArgumentException e) {
            System.err.println("error" + e.getMessage());
            e.printStackTrace();
            return -1;
        }
    }

}
