package algorithm.class04_Sort;

        import java.util.Scanner;
        import java.util.*;

public class Prob04_SortInside {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long n = input.nextInt();
        long length = (long)(Math.log10(n) + 1);
        ArrayList<Long> list = new ArrayList<>();

        int count = 0;
        while(count < length){
            list.add(n % 10);
            n /= 10;
            count++;
        }
        Collections.sort(list);

        for (int i = list.size(); i > 0; i--) {
            System.out.print(list.get(i-1));
        }
    }
}
