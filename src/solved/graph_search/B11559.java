package solved.graph_search;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B11559 {

    private static String[][] arr = new String[12][6];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 12; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < s.length; j++) {
                arr[i][j] = s[j];
            }
        }

        bw.flush();
        bw.close();
    }

    private static void gravityProcess() {
        for (int i = 0; i < 6; i++) {

            String[] temp = new String[12];

            for (int j = 0; j < 12; j++) {
                temp[j] = arr[j][i];
            }

            boolean flag = false;
            int count = 0;
            for (int j = temp.length - 1; j > 0; j--) {
                if(temp[j].equals(".")) {
                    flag = true;
                    count++;
                }else {

                }
            }
        }
    }

    private static boolean isValidPosition(int x, int y) {
        return 0 <= x && x < 6 && 0 <= y && y < 12;
    }
}
