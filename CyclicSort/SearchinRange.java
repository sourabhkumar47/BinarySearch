import java.util.Arrays;

public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {1, 7, 6, 5,  4, 2, 8, 10};

        int ans  = secondLargestInArray(arr);
        System.out.println(ans);

//        CyclicSort(arr);
//        finDuplicateInArr(arr);

//        System.out.println(Arrays.toString(arr));

//        System.out.println(arr.length);


//        System.out.println(SearchMissing(arr));
//        blanklTrianglePattern2(10);
    }

    static int secondLargestInArray(int[] arr){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }else if(arr[i]>secondLargest) {
                    secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


    static void blanklTrianglePattern(int count){
        for (int row = 0; row < count; row++) {
            for (int col = 0; col <= row; col++) {
                if (row==0 || col==0|| row == count-1 || row == col){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void blanklTrianglePattern2(int count){
        for (int row = 0; row < count; row++) {
            for (int col = 0; col < count-row; col++) {
                if (row==0 || col==0|| col == count-row-1 ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void finDuplicateInArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }

    static int SearchMissing(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i]) {
                return i;
            }
        }
        return -1;

    }

    //    static void cyclicSort(int[] arr) {
//        int i = 0;
//
//        while (i < arr.length) {
//            int correct = arr[i] - 1;
//            if (arr[i] != arr[correct]) {
//                swap(arr, arr[i], correct);
//            } else {
//                i++;
//            }
//        }
//    }
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
