package theory.dynamic;

/*
* 주어진 수열의 순서대로 가장 긴 증가 하는 부분 수열을 구해라.
* 앞에서부터 뒤로 숫자를 선택하면서 수열이 증가하는 순서대로 부분 수열을
* 만들 때 그 길이가 최대가 되게 하는 것.
* 두 가지 경우
* 1. DP로 풀 경우 : n^2의 복잡도
* 2. 이분 탐색으로 풀 경우 : n*log(n)의 복잡도*/
public class Longest_Increasing_SubSequence {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 25, 20, 50, 30, 70, 85};
        // 최대1 : 10, 20, 25, 50, 70, 85
        // 최대2 : 10, 20, 25, 30, 70, 85 -> 알고리즘에 의한 해

    }

    /* 일반적인 동적 프로그래밍으로 해결하였을 때, n^2의 복잡도*/
    private static void dp(int[] arr){
        int[] dp = new int[arr.length];

        dp[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < i; j++) {
                if(arr[i] > arr[j]){
                    if(dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                    }
                }
            }
        }
    }

    private static void lowerBound(){

    }
}


