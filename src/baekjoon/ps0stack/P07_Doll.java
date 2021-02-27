package baekjoon.ps0stack;

import java.util.ArrayList;
import java.util.Stack;

public class P07_Doll {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1, 5, 3 ,5, 1, 2, 1, 4};
        System.out.println(solution(board, moves));
    }
    private static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int size = board.length;

        ArrayList<Stack<Integer>> stackList = new ArrayList<>();

        for(int i = 0; i <= size; i++){
            stackList.add(new Stack<>());
        }

        arrToStack(board, stackList);
        for (Stack<Integer> stack : stackList) {
            System.out.println(stack.toString());
        }
        for(int value : moves) {
            if(!stackList.get(0).isEmpty()) {
                int doll = stackList.get(value).pop();
                if(doll != 0) {
                    if(stackList.get(0).peek() == doll) {
                        answer += 2;
                        stackList.get(0).pop();
                    }else {
                        stackList.get(0).push(doll);
                    }
                }
            }

        }

        return answer;
    }

    private static void arrToStack(int[][] board, ArrayList<Stack<Integer>> stackList) {
        int size = board.length;
        for(int i = size - 1; i >= 0; i--){
            for(int j = 0; j < size; j++){
                stackList.get(j + 1).push(board[j][i]);
            }
        }
    }
}
