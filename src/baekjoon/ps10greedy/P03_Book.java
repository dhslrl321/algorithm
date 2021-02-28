package baekjoon.ps10greedy;

import java.io.*;

public class P03_Book {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nm = br.readLine().split(" ");
        String[] boxesStr = br.readLine().split(" ");
        String[] booksStr = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[] boxes = new int[n];
        int[] books = new int[m];

        for (int i = 0; i < n; i++) {
            boxes[i] = Integer.parseInt(boxesStr[i]);
        }

        for (int i = 0; i < m; i++) {
            books[i] = Integer.parseInt(booksStr[i]);
        }

        int answer = 0;
        int i = 0, j = 0;
        while(true) {
            if(j == books.length) break;
            int value = boxes[i] - books[j];
            if(value >= 0) { // 박스가 충분하면
                boxes[i] = value;
                j++;
            }else { // 박스가 모자라면
                i++;
            }
        }

        for(int value : boxes) {
            answer += value;
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
