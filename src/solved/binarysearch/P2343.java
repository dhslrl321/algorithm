package solved.binarysearch;

import java.io.*;

public class P2343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[] arr = new int[n];
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
            end += arr[i];
            start = Math.max(start, arr[i]);
        }

        while (start <= end) {
            int mid = (start + end) / 2;

            int sum = 0;
            int count = 0;

            for (int value : arr) {
                if ((sum + value) > mid) {
                    sum = 0;
                    count++;
                }
                sum += value;
            }
            if(sum != 0) count++;
            if(count <= m) end = mid - 1;
            else start = mid + 1;
        }
        bw.write(String.valueOf(start));
        bw.flush();
        bw.close();
    }
}

