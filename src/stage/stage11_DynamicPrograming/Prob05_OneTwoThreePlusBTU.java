package stage.stage11_DynamicPrograming;

import java.io.*;

public class Prob05_OneTwoThreePlusBTU {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[] arr;
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());

            arr = new int[12];

            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 4;
            for (int i = 3; i < arr.length; i++) {
                arr[i] =  arr[i-3] + arr[i-2] + arr[i-1];
            }
            bw.write(arr[n-1] + "\n");
        }

        bw.flush();
        bw.close();
    }
}