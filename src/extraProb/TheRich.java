package extraProb;

        import java.math.BigInteger;
        import java.util.Scanner;

public class TheRich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long money = input.nextInt();
        BigInteger moneyB = BigInteger.valueOf(money);

        long m = input.nextInt();
        BigInteger mB = BigInteger.valueOf(m);
        BigInteger val = moneyB;
        System.out.println(moneyB.divide(mB));

        //System.out.println(moneyB - (moneyB.subtract(mB)));
    }
}
