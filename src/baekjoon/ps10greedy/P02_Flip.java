package baekjoon.ps10greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class P02_Flip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split("");
        int[] arr = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        int last = 0;
        for (int i = 1; i < arr.length; i++) {
            if(list.get(last) != arr[i]) {
                list.add(arr[i]);
                last++;
            }
        }

        int oneCount = 0;
        int zeroCount = 0;
        for(int value : list) {
            if(value == 1) oneCount++;
            else zeroCount++;
        }

        bw.write(String.valueOf(Math.min(oneCount, zeroCount)));
        bw.flush();
        bw.close();
    }
}