import java.io.*;
import java.util.*;


public class Main {

    private static int count = 0;

    public static void main(String[] args) {
        int[] arr = {8, 3, 7, 9, 2};
        int[] targets = {3, 7, 9};

        Arrays.sort(arr);

        for (int target : targets) {
            findTargetInArr(arr, 0, arr.length - 1, target);
        }

        System.out.println(count);
    }

    private static void findTargetInArr(int[] arr, int start, int end, int target) {

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                count++;
                return;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
    }

}
