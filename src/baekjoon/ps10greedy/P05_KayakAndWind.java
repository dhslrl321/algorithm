package baekjoon.ps10greedy;
import java.io.*;
import java.util.Arrays;

public class P05_KayakAndWind {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nsr = br.readLine().split(" ");
        int[] arr = new int[Integer.parseInt(nsr[0])];
        String[] ss = br.readLine().split(" ");
        String[] rr = br.readLine().split(" ");

        int[] s = new int[ss.length];
        for (int i = 0; i < s.length; i++) {
            s[i] = Integer.parseInt(ss[i]);
        }
        int[] r = new int[rr.length];
        for (int i = 0; i < rr.length; i++) {
            r[i] = Integer.parseInt(rr[i]);
        }
        Arrays.fill(arr, 1);
        for (int index : s) {
            arr[index-1] = 0;
        }

        for (int index : r) {
            if(arr[index-1] == 0) arr[index-1] = 1;
            else arr[index-1] = 2;
        }

        for (int i = 0; i < arr.length; i++) {

            if(i == 0){
                if(arr[i] == 0 && arr[i+1] == 2) {
                    arr[i] = 1;
                    arr[i+1] = 1;
                }
            }else if(i == arr.length - 1){
                if(arr[i] == 0 && arr[i-1] == 2) {
                    arr[i] = 1;
                    arr[i-1] = 1;
                }
            }else {
                if(arr[i] == 0) {
                    if(arr[i-1] == 2) {
                        arr[i] = 1;
                        arr[i-1] = 1;
                    }else if(arr[i+1] == 2) {
                        arr[i] = 1;
                        arr[i+1] = 1;
                    }
                }
            }
        }
        int answer = 0;
        for(int status : arr) {
            if(status == 0) answer++;
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }
}
