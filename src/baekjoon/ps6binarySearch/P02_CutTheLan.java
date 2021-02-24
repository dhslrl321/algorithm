package baekjoon.ps6binarySearch;

import java.io.*;
import java.util.Arrays;

public class P02_CutTheLan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] kn = br.readLine().split(" ");
        int k = Integer.parseInt(kn[0]);
        int n = Integer.parseInt(kn[1]);

        long[] arr = new long[k];

        for (int i = 0; i < k; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        long answer = 0;

        long start = 1;
        long end = arr[arr.length - 1]; // 배열 내의 최대 값 까지

        while(start <= end) {
            long mid = start + (end - start) / 2;

            if(check(arr, n, mid)) {
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

    /**
     * 이분 탐색에서 mid 조절을 더 낮게 할 것인지, 더 높게 할 것인지 ㅍ
     * */
    private static boolean check(long[] arr, int n, long x) {
        int count = 0;
        for (long value : arr) {
            count += value / x;
        }
        return count >= n;
    }
}
