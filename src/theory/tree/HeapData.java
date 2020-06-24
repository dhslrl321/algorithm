package theory.tree;

import java.util.ArrayList;

public class HeapData {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        System.out.println(list.size());
    }
}

class MinHeap {
    private ArrayList<Integer> heap;

    /*heap init*/
    public MinHeap(){
        heap = new ArrayList<>();
        heap.add(0); // heap 의 인덱스는 알기 쉽게 0부터 시작한다는 특성을 따른다.
    }
}


    // insertion
    private void insert(int data) {
        heap.add(data);
        int position = heap.size() - 1;
        while(position > 1 && pasdf)
    }
class MaxHeap {

}
