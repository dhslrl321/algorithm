package theory;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int existNumber = 9;
        int notExistNumber = 10;

        System.out.println("존재여부 = " + implByLoop(arr, existNumber));
        System.out.println("존재여부 = " + implByLoop(arr, notExistNumber));
        System.out.println("존재여부 = " + implByRecursion(arr, 0, arr.length - 1, existNumber));
        System.out.println("존재여부 = " + implByRecursion(arr, 0, arr.length - 1, notExistNumber));
    }

    private static boolean implByLoop(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == k) {
                return true;
            }

            if (arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }

    private static boolean implByRecursion(int[] arr, int start, int end, int k) {
        if (start > end) {
            return false;
        }


        int mid = (start + end) / 2;

        if (arr[mid] < k) return implByRecursion(arr, mid + 1, end, k);
        else return implByRecursion(arr, start, mid - 1, k);
    }
}
