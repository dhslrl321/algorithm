import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int a = 1210;

        String[] number = String.format("%04d", a).split("");

        int[] temp = Arrays.stream(number).mapToInt(Integer::parseInt).toArray();

        left(temp);
        left(temp);
        right(temp);
        right(temp);
        System.out.println(Arrays.toString(temp));

        System.out.println(Integer.parseInt(Arrays.toString(temp).replaceAll("[^0-9]","")));
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void left(int[] arr) {
        reverse(arr, 1, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    private static void right(int[] arr) {
        reverse(arr, 0, arr.length - 2);
        reverse(arr, 0, arr.length - 1);
    }
}
