package kep;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class P2 {
    public static void main(String[] args) throws IOException {

        String[] dict = {"ze", "qw", "as", "zx", "we", "sd", "xc", "er", "df", "cv"};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] word = br.readLine().split("");

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < dict.length; i++) {
            map.put(dict[i], i);
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < word.length - 1; i++) {
            String a = word[i] + word[i + 1];
            if(map.containsKey(a)) {
                answer.append(map.get(a));
            }
        }

        System.out.println(answer.toString());
    }
}
