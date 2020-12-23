import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] ans = new int[12];
        ans[0] = 0; ans[1] = 1; ans[2] = 2; ans[3] = 4;
        for (int i = 4; i < ans.length; i++) {
            ans[i] = ans[i-1] + ans[i-2] + ans[i-3];
        }
        while(n-- > 0) {
            int num = input.nextInt();
            System.out.println(ans[num]);
        }
    }
}