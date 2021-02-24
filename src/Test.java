public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 1, 9, 1, 1, 1, 0, 3};

        int max = Integer.MIN_VALUE;

        int size = arr.length;
        int count = 0;
        for (int i = 0; i < size - 2; i++) {
            int t1 = getSum(arr, 0, i);
            for (int j = i + 1; j < size - 1; j++) {
                int t2 = getSum(arr, i + 1, j);
                int t3 = getSum(arr, j + 1, arr.length-1);
                System.out.print("t1 의 범위 : " + 0 + " ~ " + i);
                System.out.print(" t2 의 범위 : " + (i + 1) + " ~ " + j);
                System.out.println(" t3 의 범위 : " + (j + 1) + " ~ " + (arr.length-1));
                max = Math.max(max, t1 * t2 * t3);
                count++;
            }
        }
        System.out.println(max);
        System.out.println("count : " + count);
    }
    private static int getSum(int[] arr, int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }
}