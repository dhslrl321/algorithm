package baekjoon.ps3sort;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Prob02_AgeSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Member[] members = new Member[n];
        for(int i = 0; i < n; i++){
            String[] ageAndName = br.readLine().split(" ");
            members[i] = new Member(Integer.parseInt(ageAndName[0]), i, ageAndName[1]);
        }

        Comparator<Member> myComparator = new Comparator<Member>() {
            @Override
            public int compare(Member m1, Member m2) {
                if(m1.age > m2.age) {
                    return 1;
                } else if(m1.age == m2.age) {
                    if(m1.id > m2.id) {
                        return 1;
                    }
                }
                return -1;
            }
        };
        Arrays.sort(members, myComparator);

        for(int i = 0; i < n; i ++) {
            bw.write(members[i].age + " " + members[i].name + "\n");
        }
        bw.flush();
        bw.close();
    }
}

class Member {
    int age;
    int id;
    String name;

    Member(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }
}