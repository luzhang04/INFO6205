//Rotate and array: Given an array, rotate the array to the right by k steps, where k is non-negative.

public class RotateAndArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int rotate = 3;

        for(int i = 0; i < rotate; i++) {
            int j, last;
            last = arr[arr.length - 1];
            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        for(int i : arr){
            System.out.print(i +" ");
        }

    }

}
