package programmers.level1;

import java.util.Arrays;

public class Prob12_TreasureMap {
    public static void main(String[] args) {
        int[] arr1 =
        System.out.println(Arrays.toString(solution(5, )));
    }

    private static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0; i < n; i++){
            int bin1 = Integer.parseInt(Integer.toBinaryString(arr1[i])); // arr1 이진수 변환
            int bin2 = Integer.parseInt(Integer.toBinaryString(arr2[i])); // arr2 이진수 변환

            int oper = bin1 | bin2; // or 연산 결과 지도 생성

            String[] map = Integer.toBinaryString(oper).split("");

            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < map.length; j++){
                if(map[j].equals("1")) sb.append("#");
                else sb.append(" ");
            }

            answer[i] = sb.toString();

        }


        return answer;
    }
}
