package stage.stage09_Recursive;

        import java.util.Scanner;

public class Prob02_FibonacciNumvbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(fibonacci(num));
    }

    private static int fibonacci(int num){
        if(num >= 2) return fibonacci(num - 1) + fibonacci(num - 2);
        else return num;
    }
}


