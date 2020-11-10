package baekjoon.classification.class05_BruteForce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedTransferQueue;

public class Prob07_doblue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> ans = new ArrayList<>();

        while(true){
            String[] numStr = br.readLine().split(" ");
            int[] nums = new int[numStr.length];
            int count = 0;
            for (int i = 0; i < numStr.length; i++) {
                nums[i] = Integer.parseInt(numStr[i]);
            }

            if(nums[0] == -1) {
                break;
            }
            Arrays.sort(nums);

            for (int i = 0; i < nums.length - 1; i++) {
                int mult = nums[i] * 2;
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j] > mult) break;
                    if(mult == nums[j]) {
                        count++;
                    }
                }
            }
            ans.add(count);
        }

        for(int iter : ans) {
            System.out.println(iter);
        }
    }
}
