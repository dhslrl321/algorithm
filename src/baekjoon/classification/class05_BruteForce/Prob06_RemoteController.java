package baekjoon.classification.class05_BruteForce;

import java.io.*;
import java.util.*;

public class Prob06_RemoteController {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] n = br.readLine().split("");
        int m = Integer.parseInt(br.readLine());
        String[] brokenNum = br.readLine().split(" ");


        int[] intN = new int[n.length];

        List<Integer> usableNum = new ArrayList<>();

        for (int i = 0; i < 10 - brokenNum.length; i++) {
            for (int j = 0; j < brokenNum.length; j++) {
                Integer.parseInt(brokenNum[j]);
            }
            usableNum.add(i);
        }

        bw.flush();
        bw.close();
    }
}
