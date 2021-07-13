import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/**
 * 1. head 노드 생성
 * 2.
 *
 * */
public class Main {

    public static void main(String[] args) {
        int[][] arr = {{0, 0}, {1, 1}};
        int[][] arr2 = {{0, 0}, {1, 1}};

        String a = (Arrays.deepToString(arr).equals(Arrays.deepToString(arr2))) ? "same" : "diff";

        System.out.println(a);
    }
}