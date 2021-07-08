package solved.class2;

import java.io.*;
import java.util.Arrays;

public class B2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] apartment = new int[15][15];

        apartment[0][0] = 1;

        for (int i = 0; i < apartment.length; i++) {
            apartment[0][i] = i + 1;
            apartment[i][0] = 1;
        }

        for (int i = 1; i < apartment.length; i++) {
            for (int j = 1; j < apartment[i].length; j++) {
                apartment[i][j] = apartment[i-1][j] + apartment[i][j-1];
            }
        }

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            int floor = Integer.parseInt(br.readLine());
            int roomNumber = Integer.parseInt(br.readLine());

            bw.write(String.valueOf(apartment[floor][roomNumber-1]));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
