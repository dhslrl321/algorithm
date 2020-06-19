package algorithm.class01_BinarySearch;

public class Prob00_MyBS {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 9, 8, 7, 6, 1, 4};
        int key = 3;

        System.out.println(binarySearch_Loop(arr, key));

    }

    static int binarySearch_Loop(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] > key) { // 키가 중간 값 보다 작은 경우
                // end 를 mid 로
                end = mid - 1;
            }else if (arr[mid] < key) { // 키가 중간 값 보다 큰 경우
                // start 를 mid 로
                start = mid + 1;
            }else { // arr[mid] == key
                return mid;
            }

        }
        return start;
    }

    static int binarySearch_Recursion(){
        return 0;
    }
}


