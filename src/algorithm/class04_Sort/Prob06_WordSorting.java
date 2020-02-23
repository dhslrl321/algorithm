package algorithm.class04_Sort;

import java.util.*;

public class Prob06_WordSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        String[] word = new String[n];

        for (int i = 0; i < word.length; i++) {
            word[i] = input.next();
        }

        // 길이로 정렬

        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        int j;
        for (int i = 0; i < word.length; i++) {
            int len = word[i].length();

            for (j = i + 1; j < word.length - 1; j++) {
                if(word[i].length() != word[j].length()) break;
            }
            Arrays.sort(word, i, j);
            i = j - 1;
        }

        for (int i = 0; i < word.length - 1; i++) {
            if(!word[i].equals(word[i+1])){
                System.out.println(word[i]);
            }
            if(i == word.length - 2) System.out.println(word[word.length - 1]);
        }

    }
}

