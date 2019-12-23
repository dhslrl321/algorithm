package stage05_oneDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class Prob03_MusicalScales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr[] = new int[8];

        int ascendArr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int descendArr[] = {8, 7, 6, 5, 4, 3, 2, 1};

        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        if (Arrays.toString(arr).equals(Arrays.toString(ascendArr))){
            System.out.println("ascending");
        }else if(Arrays.toString(arr).equals(Arrays.toString(descendArr))){
            System.out.println("descending");
        }else {
            System.out.println("mixed");
            System.out.println("hello world");
        }

    }
}
