package baekjoon.classification.class04_Sort;

import java.util.*;

public class Prob09_AgeSort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        BaekjoonUser[] user = new BaekjoonUser[n];

        for (int i = 0; i < user.length; i++) {
            int age = input.nextInt();
            String name = input.next();

            user[i] = new BaekjoonUser(age, name, i);
        }

        Arrays.sort(user);

        for (int i = 0; i < user.length; i++) {
            System.out.println(user[i].getAge() + " " + user[i].getName());
        }

    }
}

class BaekjoonUser implements Comparable<BaekjoonUser> {
    private int age;
    private String name;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    BaekjoonUser(int age, String name, int id){
        this.age = age;
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(BaekjoonUser o) {
        if(this.getAge() > o.getAge()) return 1;
        else if (this.getAge() == o.getAge()) {
            if(this.getId() > o.getId()) return 1;
            else if(this.getId() == o.getId()) return 0;
            else return -1;
        }
        else return -1;
    }
}

