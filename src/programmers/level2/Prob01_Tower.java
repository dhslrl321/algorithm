package programmers.level2;

import java.util.Arrays;
import java.util.Stack;

public class Prob01_Tower {
    public static void main(String[] args) {
        int[] arr = {3,9,9,3,5,7,2};

        System.out.println(Arrays.toString(solution(arr)));
    }
    private static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];


        for (int i = heights.length - 1; i > 0; i--) {

            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j < i; j++) {
                stack.push(heights[j]);
            }
            System.out.println(stack.toString() + " " + i);

            int temp = heights[i];
            int arrIndex = i;
            int stackIndex = stack.size();
            while(!stack.isEmpty()){
                int comp = stack.pop();

                if(comp > temp) {
                    answer[arrIndex--] = stackIndex;
                    break;
                }
                stackIndex--;
            }

        }
        return answer;
    }
}
