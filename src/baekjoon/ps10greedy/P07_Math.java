package baekjoon.ps10greedy;
import java.io.*;
import java.util.Arrays;

public class P07_Math {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            String[] ns = br.readLine().split(" ");
            if(ns.length == 1 && ns[0].equals("0")) break;

            int n = Integer.parseInt(ns[0]);

            int[] arr = new int[n];

            int zeroCount = 0;
            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(ns[i+1]);
                if(arr[i] == 0) zeroCount++;
            }

            Arrays.sort(arr);

            if(zeroCount > 0) {
                int[] tempArr = new int[zeroCount + 2];

                for(int i = 0; i < zeroCount + 2; i++) {
                    tempArr[i] = arr[i];
                }
                leftShift(tempArr);

                for(int i = 0; i < zeroCount + 2; i++) {
                    arr[i] = tempArr[i];
                }
            }

            StringBuilder num1 = new StringBuilder();
            StringBuilder num2 = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                if(i % 2 == 0) num1.append(arr[i]);
                else num2.append(arr[i]);
            }

            int n1 = Integer.parseInt(num1.toString());
            int n2 = Integer.parseInt(num2.toString());

            bw.write((n1 + n2) + "\n");
            bw.flush();
        }
        bw.close();
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static void reverse(int[] arr, int start, int end) {
        end = end - 1;
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void leftShift(int[] arr) {
        int size = arr.length;
        reverse(arr, size - 2, size);
        reverse(arr, 0, size - 2);
        reverse(arr, 0, size);
    }
}
