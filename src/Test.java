import java.awt.event.InputEvent;
import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {


        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        // 수열 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 테스트케이스 입력 받기
        int t = Integer.parseInt(br.readLine());

        int[] cond = new int[3];
        for (int i = 0; i < 3; i++) {
            cond[i] = Integer.parseInt(br.readLine());
        }

        int[] k = new int[t];
        // 테스트케이스만큼 반복 돌리기
        for (int i = 0; i < t; i++) {
            // i, j수열 짜르기
            // i ~ j 까지 반복하면서 k 보다 큰 값 누적하기
            // k 출력하기
            int[] newArr = Arrays.copyOfRange(arr, cond[0], cond[1]);

            for (int j = 0; j < newArr.length; j++) {
                if (newArr[j] > cond[2]) k[i] += 1;
            }

        }

        for (int i = 0; i < t; i++) {
            bw.write(k[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
