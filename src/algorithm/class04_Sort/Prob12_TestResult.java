package algorithm.class04_Sort;


import java.io.*;
import java.util.*;

public class Prob12_TestResult {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Student_Prob12> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Student_Prob12 student = new Student_Prob12(st.nextToken(),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()));

            list.add(student);
        }
        Collections.sort(list);

        for(Student_Prob12 iter : list) {
            System.out.println(iter.name);
        }
    }
}

class Student_Prob12 implements Comparable<Student_Prob12>{
    String name;
    int korean;
    int english;
    int math;

    Student_Prob12(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Student_Prob12 o) {
        if(this.korean > o.korean) return -1; // 국어 점수 내림 차순
        else if(this.korean == o.korean) {
            if(this.english > o.english) return 1; // 영어 점수 내림 차순

            else if(this.english == o.english){
                if(this.math > o.math) return -1;
                else if(this.math == o.math) {
                    return this.name.compareTo(o.name);
                    //return o.name.compareTo(this.name);
                }
                else return 1;
            }
            else return -1;
        }
        else return 1;
    }
}
