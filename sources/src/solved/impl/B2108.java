package solved.impl;

import java.io.*;
import java.util.*;


// 순서 한 번 노침, 입력값 받기 단계를 덜 끝냈는데 average 구함

/**
 * 성급했다
 */
public class B2108 {

    private static int n;
    private static int[] numbers;
    private static int[] frequencies = new int[8001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        numbers = new int[n];

        int max = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            numbers[i] = number;
            int index = 4000 + number;

            frequencies[index]++;
            int frequency = frequencies[index];
            max = Math.max(frequency, max);
        }

        // System.out.println(Math.round(average() * 10) / 10);
        System.out.println((int)Math.round(average()));
        System.out.println(middle());
        System.out.println(mode(max));
        System.out.println(range());
    }

    private static double average() {
        double sum = 0;
        for (int i : numbers) sum += i;

        return sum / n;
    }


    private static int middle() {
        if (n == 1) return numbers[0];

        Arrays.sort(numbers);
        int middleIndex = numbers.length / 2;
        return numbers[middleIndex];
    }

    private static int mode(int max) {

        List<Integer> candidates = new ArrayList<>();

        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] == max) {
                candidates.add(i);
            }
        }

        if (candidates.size() != 1) {
            return candidates.get(1) - 4000;
        }

        return candidates.get(0) - 4000;
    }

    private static int range() {
        int minIndex = 0;
        int maxIndex = numbers.length - 1;

        return numbers[maxIndex] - numbers[minIndex];
    }

}