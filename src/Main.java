import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;

        int success = 0;
        int failed = 0;

        for (int i = 0; i < 9; i++) {

            if(i != 4 && i != 5 && i != 7)
                br = new BufferedReader(new FileReader("/Users/jangwonik/Downloads/websvr_attack/Server1/access_log.2017021" + String.valueOf(i) + ".txt"));

            while(true) {
                String log = br.readLine();
                if(log == null) break;

                String[] splattedLog = log.split(" ");

                String ip = splattedLog[0];
                String httpMethod = splattedLog[5];
                String url = splattedLog[6];

                String httpStatus;

                if(splattedLog.length < 9) {
                    failed++;
                } else {
                    httpStatus = splattedLog[8];
                    if(httpStatus.charAt(0) == '2') success++;
                    else failed++;
                }
                // System.out.println("id: " + ip + "\t status: " + httpMethod + "\t url: " + url);
            }
        }

        System.out.println("성공: " + success);
        System.out.println("실패: " + failed);

        System.out.println("\n\n\n----End Of File----");
    }
}