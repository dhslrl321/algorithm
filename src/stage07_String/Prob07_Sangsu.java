package stage07_String;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

// 입력을 String으로 받았을 경우
// 입력을 int형으로 받아서 각 자리수 만큼 분해할 경우

public class Prob07_Sangsu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int left = input.nextInt();
        int right = input.nextInt();

        String leftTemp = Integer.toString(left);
        String rightTemp = Integer.toString(right);

        Integer[] leftDigits = new Integer[leftTemp.length()];
        Integer[] rightDigits = new Integer[rightTemp.length()];

        for (int i = 0; i < leftDigits.length; i++) {
            leftDigits[i] = leftTemp.charAt(i) - '0';
            rightDigits[i] = leftTemp.charAt(i) - '0';
        }

        List<Integer> leftAns = Arrays.asList(leftDigits);
        List<Integer> rightAns = Arrays.asList(rightDigits);

        Collections.reverse(leftAns);
        Collections.reverse(rightAns);

        int num1 = leftAns.get(0) * 100 + leftAns.get(1) * 10 + leftAns.get(2);
        int num2 = rightAns.get(0) * 100 + rightAns.get(1) * 10 + leftAns.get(2);

        if(num1 < num2){
            System.out.println(num2);
        }else System.out.println(num1);
    }
}
