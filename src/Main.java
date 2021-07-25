import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] word = br.readLine().split("");

        int len = (word.length % 2 == 0) ? (word.length / 2) - 1 : word.length / 2;
        int wordLength = word.length - 1;

        if(word.length % 2 == 0) {
            for (int i = 0; i <= len; i++) {
                if(!word[i].equals(word[wordLength - i])) {
                    System.out.println(0);
                    return;
                }
            }
        } else {
            for (int i = 0; i < len; i++) {
                if(!word[i].equals(word[wordLength - i])) {
                    System.out.println(0);
                    return;
                }
            }
        }
        System.out.println(1);
    }
}