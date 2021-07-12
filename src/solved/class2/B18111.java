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

        for (int i = 0; i < n; i++) {

            String[] groundRow = br.readLine().split(" ");

            for (int j = 0; j < m; j++) {
                int value = Integer.parseInt(groundRow[j]);
                ground[i][j] = value;

                max = Math.max(max, value);
                min = Math.min(min, value);
            }
        }

        int seconds = Integer.MAX_VALUE;
        int height = Integer.MIN_VALUE;

        boolean flag;

        for (int i = min; i <= max; i++) { // 최소층 부터 최대층 까지

            int tempSeconds = 0;
            int inventory = b;

            flag = false;

            for (int j = 0; j < ground.length; j++) {
                for (int k = 0; k < ground[j].length; k++) {
                    int diff = ground[j][k] - i; // 해당 블록이 현재층에서 얼마나 떨어져있는가

                    if(diff > 0) { // 양수 : 블록을 빼야함 -2
                        tempSeconds += (Math.abs(diff) * 2);
                    } else if (diff < 0) { // 음수 : 블록을 추가해야함 -1 에 인벤토리에 블록이 존재해야함
                        if(inventory - Math.abs(diff) < 0) { // 인벤토리에 존재하는 블록보다 더 많은 블록이 필요하다면?
                            flag = true;
                        }else {
                            tempSeconds += Math.abs(diff);
                            inventory -= diff;
                        }
                    }
                }
            }
            if(seconds >= tempSeconds && !flag) {
                seconds = tempSeconds;
                height = i;
            }
        }

        bw.write(seconds + " " + height);

        bw.flush();
        bw.close();
    }
}
