package algorithm.technique.skills;

public class NFactorial {
    public static void main(String[] args) {
        System.out.println(byLoop(6));
        System.out.println(byRecursion(6));
    }
    private static int byLoop(int n){
        int ret = 1;
        for(int i = 2; i <= n; i++){
            ret *= i;
        }
        return ret;
    }

    private static int byRecursion(int n){
        if(n == 1) return 1;

        return n * byRecursion(n-1);
    }
}

