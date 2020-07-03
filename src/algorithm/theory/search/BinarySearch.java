package algorithm.theory.search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,1,23,11,4,15,2,3,55,7};
        // 1, 2, 3, 4, 5, 6, 7, 8, 9
        int key = 1;

        Arrays.sort(arr);
        int loop = binarySearch_Loop(arr, key, 0 , arr.length - 1);
        int recursion = binarySearch_Recursion(arr, key, 0, arr.length-1);

        System.out.println("index : " + loop +  " 반복문 사용");
        System.out.println("index : " + recursion + " 재귀 호출 사용");
    }
    private static int binarySearch_Loop(int[] arr, int key, int start, int end){

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] > key) { // 키가 중간 값 보다 작은 경우
                // end 를 mid 로
                end = mid - 1;
            }else if (arr[mid] < key) { // 키가 중간 값 보다 큰 경우
                // start 를 mid 로
                start = mid + 1;
            }else { // arr[mid] == key
                return mid;
            }

        }
        return start - 1;
    }

    private static int binarySearch_Recursion(int[] arr, int key, int start, int end){
        int mid = (start + end) / 2;
        if(arr[mid] < key) return binarySearch_Recursion(arr, key, mid + 1, end);
        else if(arr[mid] > key) return binarySearch_Recursion(arr, key, start, end - 1);
        return mid;
    }
}
