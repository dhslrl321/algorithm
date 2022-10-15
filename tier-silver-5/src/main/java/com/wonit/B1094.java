package com.wonit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int now = 64;
        int count = 0;

        int x = Integer.parseInt(br.readLine());
        while(now != x) {
            if (now >= x) {
                now += now/2;
                count++;
            }
        }

        System.out.println("count = " + count);
    }
}
