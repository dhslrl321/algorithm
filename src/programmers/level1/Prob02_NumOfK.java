package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Prob02_NumOfK {
    public static void main(String[] args) {
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[] answer = new int[commands.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < commands.length; i++){

            if(commands[i][0] == commands[i][1]){
                answer[i] = array[commands[i][0] - 1];
            }else{
                list.clear();
                int start = commands[i][0] - 1;
                int end = commands[i][1];
                int index = commands[i][2];
                System.out.println(start+" <- start " + end + " <- end " + index + " <- index");
                for(int j = start; j < end; j++){
                    list.add(array[j]);
                }

                Collections.sort(list);
                System.out.println(list);
                answer[i] = list.get(index-1);
                System.out.println(list.get(index));
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
