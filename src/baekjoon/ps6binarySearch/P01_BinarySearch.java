package baekjoon.ps6binarySearch;

public class P01_BinarySearch {
    static int count = 0;
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int result1 = binarySearchByRecursive(arr, 0, arr.length, 3);
        System.out.println("arr [" + result1 + "] 번째 인덱스에서 [" + arr[result1] + "] 발견");
        System.out.println(count + " 번 반복을 통해서 탐색 완료함" );

        int result2 = binarySearchByLoop(arr, 7);
        System.out.println("arr [" + result2 + "] 번째 인덱스에서 [" + arr[result2] + "] 발견");
        System.out.println(count + " 번 반복을 통해서 탐색 완료함" );
    }

    private static int binarySearchByRecursive(int[] arr, int start, int end, int x) {
        if(end >= 1) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == x) return mid;

            if(arr[mid] > x) {
                count++;
                return binarySearchByRecursive(arr, start, mid - 1, x);
            }
            else {
                count++;
                return binarySearchByRecursive(arr, mid + 1, end, x);
            }
        }
        return -1; // 찾고자 하는 데이터가 리스트에 없음
    }

    private static int binarySearchByLoop(int[] arr, int x) {
        int start = 0;
        int end = arr.length;
        while(end >= 1) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == x) return mid;

            if(arr[mid] < x) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1; // 찾고자 하는 데이터가 리스트에 없음
    }
}
