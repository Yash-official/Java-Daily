public class binarySearch {

    public static boolean search(int[] arr, int start, int end, int val) {

        int mid = (end - start) / 2 + start;
        if (end - start < 0) {
            System.out.println(start - end);
            return false;
        }
        if (arr[mid] == val) {
            return true;
        }
        if (val < arr[mid]) {
            return search(arr, start, mid - 1, val);
        } else {
            return search(arr, mid + 1, end, val);
        }
    }

    public static boolean binarysearch(int[] arr, int val) {
        return search(arr, 0, arr.length - 1, val);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 10, 23, 37, 43, 82 };
        System.out.println(binarySearch.binarysearch(arr, 1));
    }
}
