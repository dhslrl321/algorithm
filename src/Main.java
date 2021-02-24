import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 4, 2, 3};

        do {
            for(int value : arr1) {
                System.out.print(value + " ");
            }
            System.out.print("\t");
            for(int value : arr2) {
                System.out.print(value + " ");
            }
            System.out.println();
        }while(nextPermutation(arr1));

    }

    private static boolean nextPermutation(int[] arr) {
        int i = arr.length - 1;
        while(i > 0 && arr[i-1] >= arr[i]) i--;
        if(i <= 0) return false;

        int j = arr.length - 1;
        while(arr[j] <= arr[i-1]) j--;
        swap(arr, i-1, j);
        j = arr.length - 1;
        while(i < j) {
            swap(arr, i, j);
            i++; j--;
        }
        return true;
    }

    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}