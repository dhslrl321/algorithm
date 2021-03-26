package baekjoon.ps10greedy;

import java.io.*;

public class P12_GasStation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] distances = br.readLine().split(" ");
        String[] prices = br.readLine().split(" ");

        int[] price = new int[n];
        int[] distance = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(prices[i]);
        }

        for (int i = 1; i < n; i++) {
            distance[i] = Integer.parseInt(distances[i-1]);
        }
        int answer = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(price[i] > price[j]) { // 현재 기름값 보다 싼 곳이 있을 때
                    // 더 싼 곳 까지의 거리 총 합
                    answer += price[i] * distance[j];
                    i = j;
                }
                // 현재 기름 값 * 최단 거리

            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
