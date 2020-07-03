package baekjoon.stage.stage07_String;

        import java.util.Scanner;

public class Prob06_CountOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine().trim();
        String[] ans = str.split("\\s");
        System.out.println(ans.length);
    }
}
