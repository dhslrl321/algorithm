package baekjoon.ps10greedy;
import java.io.*;
import java.util.Arrays;

public class P07_Math {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            String[] ns = br.readLine().split(" ");
            int[] n = new int[ns.length-1];
            if(ns.length == 1 && ns[0].equals(String.valueOf(0))) break;
            for (int i = 1; i < ns.length; i++) {
                n[i-1] = Integer.parseInt(ns[i]);
            }

            Arrays.sort(n);

            for (int i = 0; i < n.length; i++) {
         /*       if(i % 2 == 0)*/
            }

        }
        bw.flush();
        bw.close();
    }
}
