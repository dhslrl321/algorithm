package wintercoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Prob01 {
    public static void main(String[] args) {
        /*int[][] arr = {
                {1,3,1},
                {3,5,0},
                {5,4,0},
                {2,5,0}
        };*/
        int[][] arr = {{5,6,0},{1,3,1},{1,5,0},{7,6,0},{3,7,1},{2,5,0}};

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[2] - o1[2];
            }
        });


        HashMap<Integer, Integer> item = new HashMap<>();

        for (int i = 1; i <= 7; i++) {
            item.put(i, 2);
        }
        //System.out.println("map: " + item.toString());


        for (int i = 0; i < arr.length; i++) {
            int firstItem = arr[i][0];
            int secondItem = arr[i][1];
            int status = arr[i][2];
            int condition = firstItem + secondItem;
            if(status == 1) { // 둘 다 재고 있
                item.put(firstItem, 1);
                item.put(secondItem, 1);
            }else {
                int num1 = item.get(firstItem);
                int num2 = item.get(secondItem);

                if(num1 == 1 || num2 == 1) {
                    if(num1 == 1) {
                        item.put(secondItem, 0);
                    }else {
                        item.put(firstItem, 0);
                    }
                }
            }

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= item.size(); i++) {
            if(item.get(i) == 0) {
                sb.append("X");
            }else if(item.get(i) == 1){
                sb.append("O");
            }else {
                sb.append("?");
            }
        }

        System.out.println(sb.toString());
    }
}
