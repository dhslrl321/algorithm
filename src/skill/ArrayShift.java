package skill;

import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int num = 3;
        rightShift(arr, num);
        System.out.println(Arrays.toString(arr));
        leftShift(arr, num);
        System.out.println(Arrays.toString(arr));
    }
    /* swap 메서드 */
    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    /* 주어진 배열 arr 의 start 인덱스와 end 인덱스 사이에서 뒤집기*/
    private static void reverse(int[] arr, int start, int end) {
        end = end - 1;
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    /* 오른쪽 shift 연산 */
    private static void rightShift(int[] arr, int n) {
        int size = arr.length;
        reverse(arr, 0, size - n);
        reverse(arr, size - n, size);
        reverse(arr, 0, size);
    }

    /* 왼쪽 shift 연산 */
    private static void leftShift(int[] arr, int n) {
        int size = arr.length;
        reverse(arr, 0, n);
        reverse(arr, n, size);
        reverse(arr, 0, size);
    }
}
