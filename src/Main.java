import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String solution = solution("obo(5u0j_z3_gu3_cn55v0a}", 13);
        System.out.println("solution = " + solution);
    }

    public static String solution(String s, int n) {

        StringBuilder sb = new StringBuilder();

        // 문자열 s를 char[]로 만들어서 문자 배열 만들기
        char[] chars = s.toCharArray();

        for(char c : chars) {

            int point = (int) c;
            int newPoint = 0;
            if(point == 32) { // space
                newPoint = 32;
                sb.append((char)newPoint);
            }else if(65 <= point && point <= 90) { // upper
                newPoint = ((point + n) - 65) % 26;
                newPoint += 65;
                sb.append((char)newPoint);
            }else if(97 <= point && point <= 122) { // lower
                newPoint = ((point + n) - 97) % 26;
                newPoint += 97;
                sb.append((char)newPoint);
            }else {
                sb.append((char)point);
            }
        }
        return sb.toString();
    }
}