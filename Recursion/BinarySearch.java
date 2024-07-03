public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int target = 4;
        System.out.println(BSearch(arr, target, 0, arr.length-1));
    }

    static int BSearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target < arr[mid]) {
            return BSearch(arr, target, start, mid - 1);
        }
        return BSearch(arr, target, mid + 1, end);
    }
}
