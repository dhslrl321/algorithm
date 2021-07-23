import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. head 노드 생성
 * 2.
 *
 * */
public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);

        System.out.println(a.remove(2));
        System.out.println(a.remove(2));
        System.out.println(a.remove(2));

    }
}