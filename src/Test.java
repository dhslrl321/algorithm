import javax.print.DocFlavor;
import java.awt.event.InputEvent;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int[] ary = new int[arr.length];
        boolean[] array = new boolean[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];

            if(!array[a]) {
                array[a] = true;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i])
                System.out.print(i + " ");
        }
    }
}
