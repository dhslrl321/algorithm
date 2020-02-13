package stage.stage07_String;

import java.util.Scanner;

// 입력을 String으로 받았을 경우
// 입력을 int형으로 받아서 각 자리수 만큼 분해할 경우

public class Prob07_Sangsu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int left = input.nextInt();
        int right = input.nextInt();
        int[] leftArr = new int[3];
        int[] rightArr = new int[3];

        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = left % 10;
            rightArr[i] = right % 10;

            left /= 10;
            right /= 10;
        }

        left = (leftArr[0] * 100) + (leftArr[1] * 10) + (leftArr[2]);
        right = (rightArr[0] * 100) + (rightArr[1] * 10) + (rightArr[2]);

        if(left < right) System.out.println(right);
        else System.out.println(left);
    }
}
