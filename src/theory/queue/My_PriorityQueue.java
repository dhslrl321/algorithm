package theory.queue;

import jdk.jfr.Frequency;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class My_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        Person p1 = new Person(10, "jang");
        Person p2 = new Person(11, "Heo");
        Person p3 = new Person(11, "park");
        Person p4 = new Person(9, "choi");
        Person p5 = new Person(8, "seo");
        priorityQueue.offer(p1);
        priorityQueue.offer(p2);
        priorityQueue.offer(p3);
        priorityQueue.offer(p4);
        priorityQueue.offer(p5);

        System.out.println(priorityQueue.size());
        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll().name);
        }
    }
    private static class Person implements Comparable<Person> {
        int age;
        String name;

        Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Person o) {
            return o.age - this.age;
        }
    }
}

