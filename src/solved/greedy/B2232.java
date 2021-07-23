package solved.greedy;

import java.io.*;

public class B2232 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }


        boolean isDown = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if(!isDown) { // 상승
                if(arr[i] > arr[i+1]) {
                    bw.write(String.valueOf(i + 1));
                    isDown = true;
                } else if(arr[i] == arr[i + 1]) {
                    bw.write(String.valueOf(i + 1));
                }
            } else { // 하강
                if(arr[i] <= arr[i + 1]) {
                    isDown = false;
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
