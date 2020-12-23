package baekjoon.solved_Tier.bronze.bronze4;
import java.io.*;

public class Prob08_Coupon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            double n = Double.parseDouble(br.readLine());

            bw.write("$"+ (String.format("%.2f", n * 0.8)) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
