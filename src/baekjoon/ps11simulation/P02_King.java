package baekjoon.ps11simulation;

import java.io.*;

public class P02_King {

    private static int[][] movements = {
            {1, 0}, // 0 : R 오른쪽으로
            {-1, 0}, // 1 : L 왼쪽으로
            {0, -1}, // 2 : B 아래로
            {0, 1}, // 3: T 위로
            {1, -1}, // 4 : RT 오른쪽 대각선 위로
            {-1, -1}, // 5 : LT 왼쪽 대각선 위로
            {1, 1}, // 6 : RB 오른쪽 아래 대각
            {-1, 1} // 7 : LB 왼쪽 아래 대각
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        String kingPosition = inputs[0];
        String stonePosition = inputs[1];
        int loop = Integer.parseInt(inputs[2]);

        while(loop-- > 0) {

            String move = br.readLine();
            // 위치를 map 인덱스로 변환 positionConverter

            // 알파벳을 movements 인덱스 번호로 반환하는 메서드

            // 해당 번호의 검증 메서드
            //  - 라인 밖으로 가는지 안 가는지

            // 돌이 있는지 없는지 검증 메서드
            //  - 돌이 있다면 돌 위치 업데이트 시키는 메서드 추가
            //  - 돌이 없다면 킹 위치 업데이트 시키는 메서드 추가
        }

        bw.flush();
        bw.close();
    }

    /**
     * @param isCoordinate 문자열 좌표인지 아닌지
     * @return 위치 문자열 isCoordinate == true 면 문자열 위치 반환 반대면 공백을 기준으로 x, y 좌표 문자열 반환
     */
    private String positionConverter(String position, boolean isCoordinate) {
        StringBuilder sb = new StringBuilder();
        if(isCoordinate) {

        }else {
            char[] positionArr = position.toCharArray();
            /*int x = 65 -*/
        }
        return "asdf";
    }


}
