package stage.stage11_DynamicPrograming;

import java.io.*;

public class Prob02_MakeOneBTU {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        arr[0] = arr[1] = 0;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1] + 1;
            if(i % 3 == 0) arr[i] = Math.min(arr[i], arr[i/3] + 1);
            if(i % 2 == 0) arr[i] = Math.min(arr[i], arr[i/2] + 1);
        }

        bw.write(arr[n] + "\n");

        bw.flush();
        bw.close();

    }

}
