package solved.impl;

import java.io.*;

public class B1138 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");

        int[] arr = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }

        int[] answer = solution(n, arr);

        for (int value : answer) {
            bw.write(value + " ");
        }

        bw.flush();
        bw.close();
    }

    private static int[] solution(int n, int[] arr) {
        int[] answers = new int[n];

        for (int i = 0; i < arr.length; i++) {
        
        }

        return answers;
    }
}
