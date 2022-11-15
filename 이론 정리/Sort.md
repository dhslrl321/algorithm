# Sort

- 데이터를 특정 기준에 따라서 순서대로 나열하는 것

# 대표적인 종류

- 선택 정렬
- 삽입 정렬

## 1. 선택 정렬

- 설명
  - 매번 **가장** 큰(작은) 데이터를 **선택**해서 앞에서부터 순차적으로 교체한다
- 장단점
  - 장점
    - 직관적이고 구현이 쉽다
  - 단점
- 시간복잡도
  - O(n^2) => n + (n - 1) + (n - 2) ... + 2

### 구현

```java
public class Selection {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        
        for (int selectedIndex = 0; selectedIndex < arr.length - 1; selectedIndex++) {
            int minIndex = findMinimumIndexFrom(arr, selectedIndex + 1);
            swap(arr, minIndex, selectedIndex);
        }

        System.out.println(Arrays.toString(arr));
    }

    private static int findMinimumIndexFrom(int[] arr, int provided) {
        int minIndex = provided;
        for (int i = provided; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
```

## 2. 삽입 정렬

- 설명
  - 데이터를 하나씩 확인하면서, 각 데이터를 적절한 위치에 삽입
- 특징
  - 특정 데이터가 적절한 위치에 삽입되기 전에, 해당 위치 앞까지 원소들은 이미 정렬되어있다고 판단한다
    - 그래서 0 번째 인덱스 부터 정렬을 시작하지 않는다. 1번째 부터 시작한다.
- 장단점
  - 장점
    - 직관적이고 구현이 쉽다
    - 거의 정렬되었을 때 효과가 좋다
  - 단점

### 구현

```java
public class Insertion {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int insertTargetIndex = 1; insertTargetIndex < arr.length; insertTargetIndex++) {
            for (int j = 0; j < insertTargetIndex; j++) {
                if (arr[insertTargetIndex] <= arr[j]) {
                    insertLeft(arr, insertTargetIndex, j);
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void insertLeft(int[] arr, int insertTargetIndex, int start) {
        int temp = arr[insertTargetIndex];
        for (int i = insertTargetIndex; i > start; i--) {
            arr[i] = arr[i - 1];
        }
        arr[start] = temp;
    }
}
```

### References

- [정렬 알고리즘 애니메이션](https://www.toptal.com/developers/sorting-algorithms)
- [정렬 알고리즘 애니메이션, 상세 버전](https://visualgo.net/en/sorting)
