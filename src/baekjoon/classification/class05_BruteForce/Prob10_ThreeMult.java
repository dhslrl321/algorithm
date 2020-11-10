package baekjoon.classification.class05_BruteForce;

public class Prob10_ThreeMult {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            for (int j = i+1; j <= i; j++) {
                for (int k = j+1; k <= j ; k++) {
                    for (int l = k+1; l <= k ; l++) {
                        if(i*i*i == j*j*j + k*k*k + l*l*l) {
                            System.out.println("Cube = " + i + "," + "Triple = ("+ j + "," + k + ", " + l + ")");
                        }
                    }
                }
            }
        }
    }
}
