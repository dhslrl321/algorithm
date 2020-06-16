package algorithm.class09_Recursion;

public class Prob01_Hanoi {
    static int count = 0;
    public static void main(String[] args) {

    }
    static void hanoi(int n, int start, int end, int temp){
        if(n == 1){
            System.out.println(start + "->" + end);
            count++;
            return;
        }

    }
}
