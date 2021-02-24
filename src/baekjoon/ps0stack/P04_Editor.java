package baekjoon.ps0stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class P04_Editor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] n = br.readLine().split("");
        int m = Integer.parseInt(br.readLine());

        LinkedList<String> list = new LinkedList<>(Arrays.asList(n));

        int pointer = list.size();

        while(m-- > 0) {
            String[] cmds = br.readLine().split(" ");
            if(cmds.length == 1) {
                String cmd = cmds[0];
                if(cmd.equals("L")) {
                    if(pointer > 0) pointer--;
                }else if(cmd.equals("D")) {
                    if(pointer < list.size()) pointer++;
                }else if(cmd.equals("B")) {
                    if(pointer > 0) {
                        list.remove(pointer - 1);
                        pointer--;
                    }
                }
            }else {
                String cmd = cmds[1];
                list.add(pointer, cmd);
                pointer++;
            }
        }
        for(String str : list) {
            System.out.print(str);
        }
    }
}
