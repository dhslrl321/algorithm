package algorithm.technique.skills;

import java.util.Arrays;

public class ArrayControl {
    public static void main(String[] args) {
        System.out.println(maxThree(11, 13, 10));

        int[] rotateArray1 = {1,2,3,4,5};
        int[] rotateArray2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(rightRotate(rotateArray1, 1, 4)));
        System.out.println(Arrays.toString(leftRotate(rotateArray2, 1, 4)));
    }

    /* 세 수를 받아 최대 구하기.*/
    private static int maxThree(int a, int b, int c){
        if(a < b) {
            if(b < c) return c;
            else return b;
        }else {
            if(a < c) return c;
            else return a;
        }
    }

    /* s, k 인덱스를 받아 서로 변경하고 회전된 배열 구하기. */
    private static int[] rightRotate(int[] arr, int s, int k){
        int temp = arr[k];
        for (int i = k; i > s; i--) {
            arr[i] = arr[i-1];
        }
        arr[s] = temp;
        return arr;
    }

    private static int[] leftRotate(int[] arr, int s, int k){
        int temp = arr[s];
        for(int i = s; i < k; i++){
            arr[i] = arr[i+1];
        }
        arr[k] = temp;
        return arr;
    }

    /**/
}
