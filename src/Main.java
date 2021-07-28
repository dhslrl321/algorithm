import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[][] arr = {
                {8, 14},
                {3, 5},
                {5, 20},
                {1, 16},
        };

        // Arrays.sort(arr, (a1, a2) -> a1[1] - a2[1]);

        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] a1, int[] a2) {
                return a1[1] - a2[1];
            }
        };

        Arrays.sort(arr, comparator);

        System.out.println(Arrays.deepToString(arr));
    }
}