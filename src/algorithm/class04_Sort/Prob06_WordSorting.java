package algorithm.class04_Sort;

import java.util.*;

public class Prob06_WordSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        String[] word = new String[n];

        for (int i = 0; i < word.length; i++) {
            word[i] = input.next();
            word[i] = word[i].toLowerCase();
        }



        // 단어의 길이가 짧은순 정렬
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1;
                else if(o1.length() == o2.length()) return 0;
                else return -1;
            }
        });

        // 단어의 길이가 같을 때 사전순 정렬
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i+1; j < n; j++) {
                if(word[i].length() != word[j].length()) break;
            }
            Arrays.sort(word, i,j);
            i = j-1;
        }

        // 중복 제거 후 출력
        System.out.println(word[0]);
        for (int i = 1; i < n; i++) {
            if(word[i-1].equals(word[i])) continue;

            System.out.println(word[i]);
        }

    }
}

