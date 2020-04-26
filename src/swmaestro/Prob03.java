package swmaestro;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Prob03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] + maxSum > maxSum){
                maxSum = arr[i];
            }
            
        }
        System.out.println(maxSum);

    }
}
