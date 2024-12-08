package gr.aueb.cf.ch6;

public class Exercise5 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 8;
        int[] result = getLowAndHighIndexOf(arr, key);
        for (int el: result) {
            System.out.println(el);
        }
    }
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int[] result = new int[2];
        boolean foundLow = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] ==  key && foundLow != true){
                result[0] = i;
                foundLow = true;
            }
            if(arr[i] == key && foundLow == true && i == arr.length -1){
                result[1] = i;
            }

            if (arr[i] != key && foundLow == true){
                result[1] = i;
                break;
            }
        }
        return result;
    }
}
