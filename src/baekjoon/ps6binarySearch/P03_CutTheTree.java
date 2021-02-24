package baekjoon.ps6binarySearch;

import java.io.*;

public class P03_CutTheTree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        long[] arr = new long[n];
        String[] trees = br.readLine().split(" ");
        long max = 0;
        for (int i = 0; i < trees.length; i++) {
            arr[i] = Long.parseLong(trees[i]);
            max = Math.max(max, arr[i]);
        }

        long start = 0;
        long end = 1_000_000_000;
        long answer = 0;
        while(start <= end) {
            long mid = start + (end - start) / 2;
            long count = 0;
            for(long value : arr) {
                if(value - mid > 0) {
                    count += Math.abs(value - mid);
                }
            }

            if(count >= m) {
                answer = Math.max(answer, mid);
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }
}
