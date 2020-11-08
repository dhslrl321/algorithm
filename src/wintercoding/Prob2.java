package wintercoding;

public class Prob2 {
    public static void main(String[] args) {

        String encrypted_text = "qyyigoptvfb";
        String key = "abcdefghijk";
        String answer = solution(encrypted_text, key, 3);
    }

    static String solution(String encrypted_text, String key, int rotation) {
        String answer = "";

        char[] eText = encrypted_text.toCharArray();
        char[] eKey = key.toCharArray();

        System.out.println((int)'z');

        for (int i = 0; i < eText.length; i++) {
            int num = (eText[i] + eKey[i]) - 122;
            System.out.print((char)num + " ");
        }

        return answer;
    }

}
