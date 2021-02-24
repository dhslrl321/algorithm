package baekjoon.ps9exhaustiveSearch;

import java.io.*;

public class P13_AtLeast {

    static boolean[] check;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        long min = 100 * 99 * 98 * 97 * 96;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    min = Math.min(min, arr[i] * arr[j]* arr[k]);
                }
            }
        }
        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }

}
