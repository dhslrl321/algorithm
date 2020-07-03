package algorithm.technique.skills;

import java.util.ArrayList;
import java.util.List;

/*
* 주어진 수열의 순서대로 가장 긴 증가 하는 부분 수열을 구해라.
* 앞에서부터 뒤로 숫자를 선택하면서 수열이 증가하는 순서대로 부분 수열을
* 만들 때 그 길이가 최대가 되게 하는 것.
* 두 가지 경우
* 1. DP로 풀 경우 : n^2의 복잡도
* 2. 이분 탐색으로 풀 경우 : n*log(n)의 복잡도*/
public class Longest_Increasing_SubSequence {
    public static void main(String[] args) {
        //{1, 4, 6, 3, 5, 8, 6, 7};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(6);
        list.add(7);

        System.out.println(completeSearch(list));
    }

    private static int completeSearch(List<Integer> list){

        if(list.isEmpty()) return 0;

        int ret = 0;

        for (int i = 0; i < list.size(); i++) {
            List<Integer> LIS = new ArrayList<>();
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i) < list.get(j)) LIS.add(list.get(j));
            }
            ret = Math.max(ret, 1 + completeSearch(LIS));
        }
        return ret;
    }
}


