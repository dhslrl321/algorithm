package algorithm.class03_Queue;

import java.util.*;

public class Prob02_Queue2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Prob02_QueueUse queue = new Prob02_QueueUse();

        ArrayList<Integer> ans = new ArrayList<>();

        while(n >= 0) {
            String stmt = input.nextLine();
            if(stmt.length() >= 6) {
                String[] arr = stmt.split(" ");
                StringTokenizer st = new StringTokenizer(stmt, " ");
                st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                queue.push(num);
            }
            else if(stmt.equals("pop")) ans.add(queue.pop());
            else if(stmt.equals("size")) ans.add(queue.size());
            else if(stmt.equals("empty")) ans.add(queue.empty());
            else if(stmt.equals("front")) ans.add(queue.front());
            else if(stmt.equals("back")) ans.add(queue.back());
            n--;
        }

        for(int res : ans) System.out.println(res);

    }
}

class Prob02_QueueUse {
    Queue<Integer> queue = new LinkedList<>();


    int size(){

        return queue.size();
    }

    void push(int x){
        queue.add(x);
    }

    int pop(){
        try {
            return queue.remove();
        } catch (NoSuchElementException e) {
            return -1;
        }
    }

    int front(){
        try {
            return queue.element();
        } catch (NoSuchElementException e) {
            return -1;
        }
    }

    int back(){
        Object[] arr = queue.toArray();
        if(empty() == 1) return -1;
        else return (int) arr[arr.length-1];
    }

    int empty(){
        if(queue.isEmpty()) return 1;
        else return 0;
    }
}
