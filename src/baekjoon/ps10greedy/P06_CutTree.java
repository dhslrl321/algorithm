package baekjoon.ps10greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class P06_CutTree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] hn = br.readLine().split(" ");
        String[] gn = br.readLine().split(" ");

        Tree[] trees = new Tree[n];

        for (int i = 0; i < n; i++) {
            trees[i] = new Tree(Integer.parseInt(hn[i]), Integer.parseInt(gn[i]));
        }

        Arrays.sort(trees, new Comparator<Tree>() {
            @Override
            public int compare(Tree o1, Tree o2) {
                return o1.growPoint - o2.growPoint;
            }
        });

        Arrays.sort(trees, ((o1, o2) -> {
            return o1.height - o2.height;
        }));


        long answer = 0 ;
        int count = 0;
        for (Tree t : trees) {
            answer += t.height + (t.growPoint * count++);
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}

class Tree {
    int height;
    int growPoint;

    Tree(int height, int growPoint) {
        this.height = height;
        this.growPoint = growPoint;
    }
}
