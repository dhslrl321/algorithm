package topcoder;

import java.util.Arrays;

public class Prob01_KiwiJuice {
    public static void main(String[] args) {
        int[] cap = {14, 35, 86, 58, 25, 62};
        int[] bottle = {6,34,27,38,9,60};
        int[] from = {1, 2, 4, 5, 3, 3, 1, 0};
        int[] to = {0,1,2,4,2,5,3,1};
        System.out.println(Arrays.toString(solution(cap, bottle, from, to)));
    }

    private static int[] solution(int[] capacities, int[] bottles, int[] fromId, int[] toId){
        for (int i = 0; i < fromId.length; i++) {

            int from = fromId[i];
            int to = toId[i];

            int space = capacities[to] - bottles[to];

            /*키위 양이 남은 공간보다 작을 때*/
            if(space >= bottles[from]){
                bottles[to] += bottles[from];
                bottles[from] = 0;
            }else { //키위 양이 남은 공간보다 클 때
                bottles[to] += space;
                bottles[from] -= space;
            }
        }
        return bottles;
    }
}
