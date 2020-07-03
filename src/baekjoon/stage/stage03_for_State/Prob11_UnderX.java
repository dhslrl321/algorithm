package baekjoon.stage.stage03_for_State;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob11_UnderX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();
        int underX = input.nextInt();
        int[] seq = new int[count];

        ArrayList<Integer> ansSeq = new ArrayList<Integer>();

        /*수열 A를 입력하는 반복문*/
        for (int i = 0; i < count; i++) {
            seq[i] = input.nextInt();
            if (underX > seq[i]) {
                ansSeq.add(seq[i]);
            }
        }

        for (int i = 0; i < ansSeq.size(); i++) {
            System.out.print(ansSeq.get(i) + " ");
        }


        /*수열 A에서 underX보다 작은 수를 출력하는 반복문*/

    }
}
