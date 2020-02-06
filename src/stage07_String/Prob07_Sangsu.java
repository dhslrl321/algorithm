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
        //int right = input.nextInt();
        int num = 0;
        while(left >= 0){
            num = left / 10;
            System.out.println( num);
        }

    }
}
