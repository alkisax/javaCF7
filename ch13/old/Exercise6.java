package gr.aueb.cf.ch13.exercises.old;

public class Exercise6 {
    public static void main(String[] args) {
        int arr[][] = {{1012, 1136}, {1317, 1417},
                {1015, 1020}}; //expect 2
        int arr2[][] = {{1200, 1300}, {1230, 1245}, {1215, 1230}}; //expect 3
        int arr3[][] = {{900, 915}, {930, 945}, {940, 1000}, {1000, 1030}}; //expect 2

        int max =  maxCars(arr);
        System.out.println("expect 2");
        System.out.println(max);
        System.out.println("expect 3");
        System.out.println(maxCars(arr2));
        System.out.println("expect 2");
        System.out.println(maxCars(arr3));
    }
    public static int maxCars (int[][] arr){
        int max = Integer.MIN_VALUE;
        int currentCars = 0;
        int i = 0;

        int[][] newArr = new int[arr.length * 2][2];
        for (int[] event: arr) {
            newArr[i][0] = event[0];
            newArr[i][1] = 1;
            i++;
            newArr[i][0] = event[1];
            newArr[i][1] = 0;
            i++;
        }
        int[][] sortNewArray = selectionSortByFirst(newArr);

        for (int[] row: sortNewArray) {
            if (row[1] == 1){
                currentCars++;
                if (currentCars > max){
                    max = currentCars;
                }
            } else {
                currentCars--;
            }
        }
        return max;
    }

    public static int[][] selectionSortByFirst(int[][] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            // Find min
            int minPosition = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j][0] < arr[minPosition][0]) {
                    minPosition = j;
                }
            }
            // Swap(minPos, i)
            swapRows(arr, minPosition, i);
        }
        return arr;
    }
    public static void swapRows(int[][] arr, int i, int j) {
        int[] tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
