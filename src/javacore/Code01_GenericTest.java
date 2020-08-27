package javacore;

import java.util.LinkedList;

public class Code01_GenericTest {
    public static void main(String[] args) {

        Box<String> box = new Box<>();

        box.setData("hello");
        String data = box.getData();

        System.out.println(data);
    }
}

class Box<T> {

    private T data;

    void setData(T data) {
        this.data = data;
    }

    <T>T getData() {
        return data;
    }
}
