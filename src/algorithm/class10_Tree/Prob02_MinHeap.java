package algorithm.class10_Tree;

import java.io.*;
import java.util.*;

public class Prob02_MinHeap {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        MinHeap minHeap = new MinHeap();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int iter : arr) {
            if(iter == 0) bw.write(minHeap.delete() + "\n");
            else minHeap.insert(iter);
        }
        bw.flush();
        bw.close();
    }
}

class MinHeap {
    List<Integer> heap;

    MinHeap(){
        heap = new ArrayList<>();
        heap.add(0);
    }

    void insert(int data){
        heap.add(data);

        int index = heap.size() - 1;

        while(index > 1 && heap.get(index / 2) > heap.get(index)) {

            int temp = heap.get(index / 2);
            heap.set(index / 2, heap.get(index));
            heap.set(index, temp);

            index /= 2;
        }
    }

    int delete() {
        if(heap.size() - 1 < 1){ // heap 크기가 1보다 작으면 즉 1이면 == 0번째 인덱스만 남으면
            return 0;
        }
        int removeData = heap.get(1);
        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int index = 1;
        while((index * 2) < heap.size()) { // 자식 사이즈가 작을 때 까지
            int childData = heap.get(index * 2);
            int childIndex = index * 2;
            if(heap.get(index * 2) < heap.get(index * 2) + 1 && (index * 2 + 1) < heap.size()) {
                childData = heap.get(childIndex + 1);
                childIndex = childIndex + 1;
            }

            if(heap.get(index) < heap.get(childIndex)) {
                break;
            }

            int temp = childData;
            heap.set(childIndex, heap.get(index));
            heap.set(index, temp);
        }

        return removeData;
    }
}
