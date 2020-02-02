package stage06_Function;

public class Prob01_SimpleSumFunc {
    public static void main(String[] args) {

    }

}

class Test {
    long sum(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }
}
