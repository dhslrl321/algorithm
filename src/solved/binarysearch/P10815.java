package solved.binarysearch;

import java.util.*;
import java.io.*;

public class P10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] ns = new int[n];

        String[] inputs = br.readLine().split(" ");

        for (int i = 0; i < ns.length; i++) {
            ns[i] = Integer.parseInt(inputs[i]);
        }

        Arrays.sort(ns);

        int m = Integer.parseInt(br.readLine());
        String[] ms = br.readLine().split(" ");

        int[][] arr = new int[m][2];
        for (int i = 0; i < m; i++) {
            arr[i][0] = Integer.parseInt(ms[i]);
        }
        // 정렬을 해야만 bs 가 가능하다

        // arr 와 inputArr 가 존재

        for (int i = 0; i < arr.length; i++) {
            // bs 돌린 후 flag 설정
            // 1 : 존재
            // 2 : 부재
            int target = arr[i][0];
            int start = 0;
            int end = ns.length - 1;

            while (start <= end) {
                int mid = (end + start) / 2;
                if (ns[mid] == target) { // 존재한다면
                    arr[i][1] = 1;
                    break;
                }

                if (ns[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1] == 1) {
                bw.write(1 + " ");
            } else {
                bw.write(0 + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}
