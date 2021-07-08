package solved.class2;

import java.io.*;

public class B10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());

        while(loop-- > 0) {
            String[] hwn = br.readLine().split(" ");

            int h = Integer.parseInt(hwn[0]);
            int w = Integer.parseInt(hwn[1]);
            int n = Integer.parseInt(hwn[2]);

            String floor, roomNumber;

            if((h / n) > 0) {
                floor = String.valueOf(h % n);
                int tempRoomNumber = (h / n) + 1;

                if(tempRoomNumber < 10) {
                    roomNumber = "0" + tempRoomNumber;
                }else {
                    roomNumber = String.valueOf(tempRoomNumber);
                }
            }else {
                floor = String.valueOf(h-n);
                System.out.println("helr");
                roomNumber = "01";
            }

            bw.write(floor + roomNumber + "\n");
        }

        bw.flush();
        bw.close();
    }
}
