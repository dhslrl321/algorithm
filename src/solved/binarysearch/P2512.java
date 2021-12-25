package solved.binarysearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P2512 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());

        int[] budgets = new int[n];

        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            budgets[i] = Integer.parseInt(arr[i]);
            max = Math.max(budgets[i], max);
        }
        int answer = binarySearch(budgets, 0, max, m);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static int binarySearch(int[] arr, int start, int end, int m) {
        int mid = 0;

        while(start <= end) {
            mid = (start + end) / 2;
            long sum = sum(arr, mid);

            if (sum <= m) { // 예산이 적은 경우
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    private static long sum(int[] arr, int top) {
        long sum = 0;
        for (int i : arr) {
            if (i > top) sum += top;
            else sum += i;
        }
        return sum;
    }
}
