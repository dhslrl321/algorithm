package solved.graph_search;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class B14502 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[][] original = new int[n][m];

        for (int i = 0; i < original.length; i++) {
            String[] inputs = br.readLine().split(" ");
            for (int j = 0; j < inputs.length; j++) {
                original[i][j] = Integer.parseInt(inputs[j]);
            }
        }

        while(true) {

            int[][] arr = copyArray(original);

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr[i].length; j++) {

                    if(arr[i][j] == 0) {
                        arr[i][j] = 1;
                    }

                    for (int k = j + 1; k < arr[i].length; k++) {

                    }
                }
            }


            break;
        }

        bw.flush();
        bw.close();
    }

    private static int[][] copyArray(int[][] original) {
        int[][] newArray = new int[original.length][original[0].length];

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = original[i][j];
            }
        }

        return newArray;
    }

    private static int getSafetyArea(int[][] arr) {

        int zeroCount = 0;

        for (int i = 0; i < arr.length; i++) {
            for(int value : arr[i]) {
                if(value == 0) zeroCount++;
            }
        }

        return zeroCount;
    }
}
