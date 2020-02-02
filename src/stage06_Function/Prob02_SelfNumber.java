package stage06_Function;

import java.util.Arrays;

public class Prob02_SelfNumber {
    public static void main(String[] args) {
        SelfNumber selfNumber = new SelfNumber();
    }
}

class SelfNumber {
    public SelfNumber() {
        int[] number = new int[10000];

        for (int i = 0; i <= 10000; i++) {
            number[i] = i;
        }
        System.out.println(Arrays.toString(number));
    }
}
