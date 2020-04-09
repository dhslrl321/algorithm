import javax.print.DocFlavor;
import java.awt.event.InputEvent;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        long n = 12345678912L;
        String str = Long.toString(n);
        String[] temp = str.split("");
        BigInteger num = BigInteger.valueOf(n);
        int[] answer = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            answer[i] = num.mod(BigInteger.valueOf(10));
        }


        for(int iter : answer) System.out.print(iter+" ");
    }
}
