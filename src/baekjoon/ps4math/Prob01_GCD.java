package baekjoon.ps4math;

public class Prob01_GCD {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        System.out.println(gcdByRecursive(a, b));
        System.out.println(lcm(a, b));
    }

    private static int gcdByLoop(int a, int b) {
        while(b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int gcdByRecursive(int a, int b) {
        if(a < b) swap(a, b);
        if(b == 0) {
            return a;
        }
        return gcdByRecursive(b, a % b);
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcdByLoop(a, b);
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
