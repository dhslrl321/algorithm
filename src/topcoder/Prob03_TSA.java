package topcoder;

public class Prob03_TSA {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 1, 1, 1};
        int[] arr3 = {0, 998, 997, 996, 995};

        System.out.println("arr1: [" + solution(arr1) + "] arr2: [" + solution(arr2) + "] arr3: [" + solution(arr3) + "]");
    }

    static int solution(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int mult = arr[i] + 1;
            for (int j = 0; j < arr.length; j++) {
                if(i != j) {
                    mult *= arr[j];
                }
            }
            max = Math.max(mult, max);
        }
        return max;
    }
}
