import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        String word = "abc";

        char[] letters = word.toCharArray();

        int a = letters[0] - 'a';
        int b = letters[1] - 'a';
        int c = letters[2] - 'a';

        System.out.printf("a=%d, b=%d, c=%d", a, b, c);
    }
}
