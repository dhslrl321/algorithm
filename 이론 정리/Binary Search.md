# Binary Search, 이분 탐색

- **오름차순으로 정렬된 리스트**에서 특정한 값의 위치를 찾는 알고리즘
  - 순서
    1. 처음 **중간의 값을 임의의 값**으로 선택, 
    2. 그 값과 찾고자 하는 값의 크고 작음을 비교함
    3. 처음 선택한 중앙값이 만약 찾는 값보다 **크면** 그 값은 **새로운 최댓값**으로 변경 후 위 과정을 반복 
    4. 처음 선택한 중앙값이 만약 찾는 값보다 **작으면** 그 값음 **새로운 최소값**으로 변경 후 위 과정을 반복
- 특징
  - 이분 탐색의 전제조건은 정렬임
    - 그래서 애초에 데이터를 삽입할 때 정렬된 형태로 넣어놓고 찾을 때 이분 탐색을 사용해서 빠르게 찾을 수 있음
  - 순차 탐색보다 효율이 좋음
    - 순차 탐색: `O(N)`
    - 이분 탐색: `O(logN)`
  - 코테에서는 10,000,000 건이 넘어가면 이분 탐색으로 풀어야 할 확률이 높음
    - 천만건 이상이면 이분 탐색

# 구현

- 구현 방법은 두가지가 존재
  1. 재귀로 구현
  2. 반복으로 구현

### 재귀로 구현

```java
int binarySearch(int[] arr, int key, int start, int end) {
    if (start > end) {
        return -1;
    }
    int mid = (start + end) / 2;

    if (arr[mid] > key) {
        return binarySearch(arr, key, start, mid - 1);
    } else if (arr[mid] < key) {
        return binarySearch(arr, key, mid + 1, end);
    } else {
        return mid;
    }
}
```

### 반복으로 구현

```java
int binarySearch(int[] arr, int key) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
        int mid = (start + end) / 2;
        if (arr[mid] > key) {
            end = mid - 1;
        } else if (arr[mid] < key) {
            start = mid + 1;
        } else {
            return mid;
        }
    }

    return -1;
}
```

# 장단점

- 장점
  - 검색이 반복될 때마다 목표값을 찾을 확률은 두 배가 되므로 속도가 빠르다는 장점이 있다.
- 단점
  - ㅁㄴㅇ