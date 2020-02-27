package algorithm.class05_BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class Prob04_7Dwarf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dwarfs = new int[9];

        for (int i = 0; i < 9; i++) {
            dwarfs[i] = input.nextInt();
        }
        Arrays.sort(dwarfs);
        int[] ans = new int[7];
        for (int i = 0; i < dwarfs.length-6; i++) {
            for (int j = 0; j < dwarfs.length-5; j++) {
                for (int k = 0; k < dwarfs.length-4; k++) {
                    for (int l = 0; l < dwarfs.length-3; l++) {
                        for (int m = 0; m < dwarfs.length-2; m++) {
                            for (int n = 0; n < dwarfs.length-1; n++) {
                                for (int o = 0; o < dwarfs.length; o++) {
                                    if(dwarfs[i] + dwarfs[j] + dwarfs[k] + dwarfs[l] + dwarfs[m] + dwarfs[n] + dwarfs[o] == 100){
                                        ans[0] = dwarfs[i];
                                        ans[1] = dwarfs[j];
                                        ans[2] = dwarfs[k];
                                        ans[3] = dwarfs[l];
                                        ans[4] = dwarfs[m];
                                        ans[5] = dwarfs[n];
                                        ans[6] = dwarfs[o];
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Arrays.sort(ans);
        for ( int iter : ans) System.out.println(iter);
    }
}
