package solved.class2;

import java.io.*;
import java.util.Arrays;

public class B1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int answer = 0;

        while(true) {
            Arrays.sort(arr, 1, arr.length - 1);
            boolean flag = false;
            if(arr[0] <= arr[arr.length-1]) {
                arr[0]++;
                arr[arr.length-1]--;
                answer++;
                flag = true;
            }
            if(!flag){
                break;
            }
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }
}
