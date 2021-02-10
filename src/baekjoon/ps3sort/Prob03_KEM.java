package baekjoon.ps3sort;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Prob03_KEM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String[] score = br.readLine().split(" ");
            students[i] = new Student(
                    score[0],
                    Integer.parseInt(score[1]),
                    Integer.parseInt(score[2]),
                    Integer.parseInt(score[3]));
        }
        Comparator<Student> myComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.korean < o2.korean) {
                    return 1;
                }else if(o1.korean == o2.korean) {
                    if(o1.english > o2.english) {
                        return 1;
                    }else if(o1.english == o2.english) {
                        if(o1.math < o2.math) {
                            return 1;
                        }else if (o1.math == o2.math) {
                            return o1.name.compareTo(o2.name);
                        }
                    }
                }
                return -1;
            }
        };
        Arrays.sort(students, myComparator);
        for (int i = 0; i < n; i++) {
            bw.write(students[i].name + "\n");
        }


        bw.flush();
        bw.close();
    }
}

class Student {
    String name;
    int korean;
    int english;
    int math;

    Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}
