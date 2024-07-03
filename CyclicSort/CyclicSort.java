import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {

        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1, 0};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void CyclicSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[i] - 1) {
                swap(arr, arr[i], i);
            }
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
