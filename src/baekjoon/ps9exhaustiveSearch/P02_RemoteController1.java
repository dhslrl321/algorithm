package baekjoon.ps9exhaustiveSearch;

import java.io.*;
import java.util.Arrays;

public class P02_RemoteController1 {

    static boolean[] keyPad = new boolean[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.readLine();
        String[] brokenNumbers = br.readLine().split(" ");

        for (int i = 0; i < brokenNumbers.length; i++) {
            keyPad[Integer.parseInt(brokenNumbers[i])] = true;
        }

        int answer = Math.abs(n - 100);

        for (int i = 0; i <= 1_000_001 ; i++) {
            int clickCount = check(i);
            if(clickCount > 0) {
                int press = Math.abs(n - i);
                answer = Math.min(answer, clickCount + press);
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
    private static int check(int number) {
        if(number == 0) {
            if(!keyPad[0]) return 1;
            else return 0;
        }
        int clickCount = 0;
        while (number > 0) {
            if(keyPad[number % 10]) return 0; // 만약 고장난 키패드면 아웃
            number /= 10;
            clickCount++;
        }
        return clickCount;
    }
}
