package baekjoon.ps6binarySearch;

import java.io.*;
import java.util.Arrays;

public class P05_NumberCard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] ns = br.readLine().split(" ");
        int[] cards = new int[n];
        for (int i = 0; i < ns.length; i++) {
            cards[i] = Integer.parseInt(ns[i]);
        }

        Arrays.sort(cards);

        int m = Integer.parseInt(br.readLine());
        String[] ms = br.readLine().split(" ");
        int[] answer = new int[m];
        for (int i = 0; i < m; i++) {
            if(Arrays.binarySearch(cards, Integer.parseInt(ms[i])) <= -1) answer[i] = 0;
            else {
                answer[i] += 1;
            }
        }
        for(int value : answer) {
            bw.write(value + " ");
        }
        bw.flush();
        bw.close();
    }
}
