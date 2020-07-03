package baekjoon.classification.class13_Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Prob03_VerticalRead {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[5];
        int maxLen = 0;
        for (int i = 0; i < 5; i++) {
            strings[i] = br.readLine();
            maxLen = Math.max(strings[i].length(), maxLen);
        }
        String[] letter = new String[maxLen];
        int index = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < letter.length; j++) {
                letter[i] = 
            }
        }

    }
}
