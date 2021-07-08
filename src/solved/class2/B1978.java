package solved.class2;

import java.io.*;

public class B1978 {

    private static int[] numbers = new int[1001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;

        int n = Integer.parseInt(br.readLine());
        String[] candidates = br.readLine().split(" ");

        removePrimeNumber();

        for(String candidate : candidates) {
            int number = Integer.parseInt(candidate);
            if(number == 1) continue;
            if(numbers[number] == 0) {
                answer++;
            }
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }
    
    private static void removePrimeNumber() {
        for (int i = 2; i < numbers.length; i++) {
            if(numbers[i] == 1) continue; // 소수인 경우

            for (int j = 2 * i; j < numbers.length; j += i) {
                numbers[j] = 1;
            }
        }
    }

}
