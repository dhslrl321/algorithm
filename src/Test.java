
import java.util.Scanner;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        if(binarySearch(arr, 10)) System.out.println(true);
        else System.out.println(false);

        System.out.println("//////////////");
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 10));

    }

    static boolean binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while(end - start >= 0){
            mid = (start + end) / 2;

            if(arr[mid] == key) return true;
            else if(arr[mid] > key) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }
}
