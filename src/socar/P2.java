package socar;

public class P2 {

    static int k;
    private static boolean flag = true;

    public static void main(String[] args) {
        // int[] numbers = {10, 40, 30, 20};
        //int[] numbers = {3, 7, 2, 8, 6, 4, 5, 1};
        int[] numbers = {5, 10};
        boolean[] visited = new boolean[numbers.length];
        k = 3;

        combination(numbers, visited, 0, numbers.length, 2);
        System.out.println(flag);
    }

    private static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            int diff = Math.abs(arr[0] - arr[1]);

            if(diff <= k) flag = false;
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
    static void print(int[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
