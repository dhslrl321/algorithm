package solved.greedy;

import java.io.*;
import java.util.Arrays;

public class B1263 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {

            String[] ts = br.readLine().split(" ");

            arr[i][0] = Integer.parseInt(ts[0]);
            arr[i][1] = Integer.parseInt(ts[1]);
        }

        Arrays.sort(arr, (a1, a2) -> a2[1] - a1[1]);

        int endTime = arr[0][1] - arr[0][0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i][1] < endTime) {
                endTime = arr[i][1];
            }
            endTime = endTime - arr[i][0];
        }

        if(endTime > 0) {
            bw.write(String.valueOf(endTime));
        }else {
            bw.write(String.valueOf(-1));
        }

        bw.flush();
        bw.close();
    }
}
