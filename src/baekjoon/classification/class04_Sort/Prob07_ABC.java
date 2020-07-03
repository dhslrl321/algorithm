package baekjoon.classification.class04_Sort;

import java.util.*;

public class Prob07_ABC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a , b , c;
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);

        a = arr[0];
        b = arr[1];
        c = arr[2];

        String stmt = input.next();

        char[] stmtArr = stmt.toCharArray();

        int i = 0;
        int flag = 0;
        while(flag < 3){
            if(stmtArr[i] == 'A') {
                System.out.print(a);
                flag++;
            }else if(stmtArr[i] == 'B'){
                System.out.print(b);
                flag++;
            }else{
                System.out.print(c);
                flag++;
            }
            System.out.print(" ");
            i++;
        }
    }
}
