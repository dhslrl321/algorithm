package baekjoon.solved_Tier.silver.silver5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Prob04_Auction {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int u = Integer.parseInt(st1.nextToken());
        int n = Integer.parseInt(st1.nextToken());

        int[] nums = new int[u+1];

        String[] names = new String[n+1];
        int[] salePrice = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            names[i] = st2.nextToken();
            salePrice[i] = Integer.parseInt(st2.nextToken());
            nums[salePrice[i]]++;
        }
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int min = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) {
                min = temp[i];
                break;
            }
        }

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == min){
                int index = Arrays.binarySearch(salePrice, i);
                bw.write(names[index] + " " + salePrice[index]);
                break;
            }
        }
        bw.flush();
        bw.close();
    }
}
