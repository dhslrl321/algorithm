package programmers.level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Prob07_CrainDoll {
    public static void main(String[] args) {
        int[][] board = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };
        int result = 0;
        int[] moves = {1,5,3,5,1,2,1,4};

        Stack<Integer>[] stacks = new Stack[board.length];
        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new Stack<>();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] > 0 ) stacks[j].push(board[i][j]);
            }
        }
        Stack<Integer> destination = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            int index = moves[i] - 1;
            if(!stacks[index].isEmpty() && !destination.isEmpty()){
                if(stacks[index].peek().equals(destination.peek())){
                    stacks[index].pop();
                    destination.pop();
                    result++;
                }
            }else if(!stacks[index].isEmpty() && destination.isEmpty()){
                destination.push(stacks[index].pop());
            }

            /* 남은 스택 중복 제거 과정 */
            if(destination.size() > 2) {
                int[] arr = new int[destination.size()];
                for (int j = 0; j < destination.size() - 1; j++) {
                    arr[j] = destination.pop();
                }
                for (int j = 0; j < arr.length - 1; j++) {
                    if(arr[j] == arr[j+1]) {
                        result++;
                        j++;
                    }else {
                        destination.push(arr[j]);
                    }
                }
            }
        }
        System.out.println(result);
    }
}
