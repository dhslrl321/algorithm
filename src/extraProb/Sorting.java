package extraProb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언

        int arrSize = Integer.parseInt(bf.readLine());

        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr);
        for(int a : arr){
            System.out.println(a);
        }
    }
}
