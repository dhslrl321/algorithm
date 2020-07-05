import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int n  = 5;
        int[] arr1 = {20, 9, 1, 6, 15};
        int[] arr2 = {11, 5, 3, 2, 8};

        String[] answer = new String[n];
        String[] map = new String[n];
        for(int i = 0; i < n; i++){
            map[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        System.out.println(Arrays.toString(map));
    }

}