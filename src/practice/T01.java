package practice;

import java.util.Arrays;

public class T01 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int[] refinedArray = Arrays.copyOfRange(array, 2, 6);

        System.out.println(Arrays.toString(refinedArray));
    }
}
