import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int k = input.nextInt();

        Integer[] arr = new Integer[n];

        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int cost = arr[k-1] - arr[arr.length-1];
        System.out.println(cost);
    }
}
