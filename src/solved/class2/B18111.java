package solved.class2;

import java.io.*;

public class B18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nmb = br.readLine().split(" ");
        int n = Integer.parseInt(nmb[0]);
        int m = Integer.parseInt(nmb[1]);
        int b = Integer.parseInt(nmb[2]);

        int[][] ground = new int[n][m];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < ground.length; i++) {

            String[] groundRow = br.readLine().split(" ");

            for (int j = 0; j < m; j++) {
                int value = Integer.parseInt(groundRow[j]);
                ground[i][j] = value;

                max = Math.max(max, value);
                min = Math.min(min, value);
            }
        }

        int answerSeconds = Integer.MAX_VALUE; // 시간
        int answerHeight = -1; // 층

        for (int i = min; i <= max; i++) { // 최소층 부터 최대층 까지

            int seconds = 0;
            int inventory = b;

            for (int j = 0; j < ground.length; j++) {
                for (int k = 0; k < ground[j].length; k++) {
                    int diff = ground[j][k] - i;

                    if(diff > 0) { // 제거해야 함
                        seconds += Math.abs(diff) * 2;
                        inventory += Math.abs(diff);
                    }else if(diff < 0){ // 추가해야 함
                        seconds += Math.abs(diff);
                        inventory -= Math.abs(diff);
                    }
                }
            }

            if(inventory >= 0) {
                if(seconds <= answerSeconds) { // == 가 포함되어야 함 ㅇ그렇지 않으면 최대 높이를 판별 하지 못함
                    answerSeconds = seconds;
                    answerHeight = i;
                }
            }
        }

        bw.write(answerSeconds + " " + answerHeight);

        bw.flush();
        bw.close();
    }
}
