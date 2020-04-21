package solved_Tier.silver5;

import java.io.*;

public class Prob03_MaxMult {

    double[] d = new double[10001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        double[] arr = new double[n];

        double max, mult;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        max = mult = arr[0];

        for (int i = 1; i < n; i++) {
            if(arr[i] > mult * arr[i]){
                mult = arr[i];
            }else mult *= arr[i];
            if(max < mult) max = mult;
        }
        bw.write(String.format("%.3f", max));

        bw.flush();
        bw.close();
    }
}
