package baekjoon.solved_Tier.silver5;

import java.io.*;
import java.util.*;

public class Prob02_Nnum {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(input.readLine());
        int[] arr = new int[10];
        int j = 0;
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(input.readLine());
            j = 0;
            while(st.hasMoreTokens()){
                arr[j] = Integer.parseInt(st.nextToken());
                j++;
            }
            Arrays.sort(arr);
            output.write(arr[7] + "\n");
        }

        output.flush();
        output.close();
    }
}
