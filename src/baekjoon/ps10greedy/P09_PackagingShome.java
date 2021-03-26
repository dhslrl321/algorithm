package baekjoon.ps10greedy;

import java.io.*;

public class P09_PackagingShome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nm = br.readLine().split(" ");
        String[] boxes = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int answer = 1;
        int index = 0;
        if (n == 0) answer = 0;
        else {
        int[] arr = new int[n];

        for (int i = 0; i < boxes.length; i++) {
            arr[i] = Integer.parseInt(boxes[i]);
        }
        while (true) {
            if(index == arr.length - 1) break;

                int size = m - arr[index];
                if(size <= 0) { // 새로운 박스를 갈아 끼울 떄
                    if(size == 0) index++;
                    answer++;
                    m = 10;
                }else { // 책이 박스로 들어갈 때
                    m -= arr[index++];
                }
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
