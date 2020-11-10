package baekjoon.classification.class05_BruteForce;

        import java.io.BufferedReader;
        import java.io.BufferedWriter;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Scanner;
        import java.util.StringTokenizer;

public class Prob08_BottomTIle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = br.readLine().split(" ");

        int r = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);

        System.out.println((r+b) / 3 + " " + 3);
    }
}
