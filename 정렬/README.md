# 나의 코딩 테스트 준비...

> 여기서는 프로그래머스 공부랑...
> 코테 준비를 위한 서적을 참고해서...

<hr />

- 정렬 `Sorting`
  - 연속된 데이터를 기준에 따라서 정렬하기 위한 알고리즘
    - 데이터를 특정한 기준에 따라서 순서대로 나열
  - 선택 정렬
  - 삽입 정렬
  - 퀵 정렬
  - 계수 정렬

- 선택 정렬 `Selection Sort`

  > 데이터가 무작위로 다수 존재할 때 , 가장 작은 데이터를 선택해 맨 앞에 있는 데이터와 바꾸고, 그 다음 작은 데이터를 선택해 앞에서 두 번째 데이터와 바꾸는 일련의 과정을 반복

  - 매번 가장 작은 것을 선택하는 정렬 기법
    - 가장 작은 데이터를 앞으로 보내는 과정을 `n-1`번 반복하면 정렬 완료
    - `O(n)`

  ```
  import java.util.*;
  
  public class Main {
  
      public static void main(String[] args) {
  
          int n = 10;
          int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
  
          for (int i = 0; i < n; i++) {
              int min_index = i; // 가장 작은 원소의 인덱스 
              for (int j = i + 1; j < n; j++) {
                  if (arr[min_index] > arr[j]) {
                      min_index = j;
                  }
              }
              // 스와프
              int temp = arr[i];
              arr[i] = arr[min_index];
              arr[min_index] = temp;
          }
  
          for(int i = 0; i < n; i++) {
              System.out.print(arr[i] + " ");
          }
      }
  
  }
  ```

- 삽입 정렬 `Insertion Sort`

  - 데이터가 거의 정렬되어 있을 때 효율적
  - 특정한 데이터를 적절한 위치에 삽입
  - 특정한 데이터가 적절한 위치에 들어가기 이전에, 그 앞까지의 데이터는 이미 정렬되어 있다고 가정
    - 정렬되어 있는 데이터 리스트에서 적절한 위치를 찾은 뒤에, 그 위치에 삽입
    - 정렬이 이우어진 원소는 항상 오름차순을 유지
    - `O(n^2)`
    - 정렬이 어느정도 되어 있는 상태라면 `O(n)`

  ```
  import java.util.*;
  
  public class Main {
  
      public static void main(String[] args) {
  
          int n = 10;
          int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
  
          for (int i = 1; i < n; i++) {
              // 인덱스 i부터 1까지 감소하며 반복하는 문법
              for (int j = i; j > 0; j--) {
                  // 한 칸씩 왼쪽으로 이동
                  if (arr[j] < arr[j - 1]) {
                      // 스와프(Swap)
                      int temp = arr[j];
                      arr[j] = arr[j - 1];
                      arr[j - 1] = temp;
                  }
                  // 자기보다 작은 데이터를 만나면 그 위치에서 멈춤
                  else break;
              }
          }
  
          for(int i = 0; i < n; i++) {
              System.out.print(arr[i] + " ");
          }
      }
  
  }
  ```

- 퀵 정렬 `Quick Sort`

  - 기준을 설정한 다음 큰 수와 작은 수를 교환한 후 리스트를 반으로 나누는 방식으로 동작
  - 피벗 사용 `pivot`
    - 큰 숫자와 작은 숫자를 교환할때, 기준점
  - 평균 `O(nlogn)`
  - 최악 `O(n^2)`

  ```
  import java.util.*;
  
  public class Main {
  
      public static void quickSort(int[] arr, int start, int end) {
          if (start >= end) return; // 원소가 1개인 경우 종료
          int pivot = start; // 피벗은 첫 번째 원소
          int left = start + 1;
          int right = end;
          while (left <= right) {
              // 피벗보다 큰 데이터를 찾을 때까지 반복
              while (left <= end && arr[left] <= arr[pivot]) left++;
              // 피벗보다 작은 데이터를 찾을 때까지 반복
              while (right > start && arr[right] >= arr[pivot]) right--;
              // 엇갈렸다면 작은 데이터와 피벗을 교체
              if (left > right) {
                  int temp = arr[pivot];
                  arr[pivot] = arr[right];
                  arr[right] = temp;
              }
              // 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
              else {
                  int temp = arr[left];
                  arr[left] = arr[right];
                  arr[right] = temp;
              }
          }
          // 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
          quickSort(arr, start, right - 1);
          quickSort(arr, right + 1, end);
      }
  
      public static void main(String[] args) {
          int n = 10;
          int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
  
          quickSort(arr, 0, n - 1);
  
          for(int i = 0; i < n; i++) {
              System.out.print(arr[i] + " ");
          }
      }
  
  }
  ```

  - 계수 정렬 `Count Sort`

    - 특정한 조건이 부합할 때만 사용할 수 있지만, 매우 빠른 정렬 알고리즘
      - 데이터의 크기가 한정되어 있고, 데이터의 크기가 많이 중복되어 있을수록 유리하며 항상 사용할 수 없음
    - 데이터의 개수가 `N`, 데이터 중 최댁값이 `K`일 때, 계수 정렬은 최악의 경우에도 수행 시간이 `O(N+K)`
    - 데이터의 크기 범위가 제한되어 정수 형태로 표현할 수 있을 때 사용
      - 일반적으로 별도의 리스트를 선언하고, 그 안에 정렬에 대한 정보를 담는다는 특징 존재

    ```
    import java.util.*;
    
    public class Main {
    	
        public static final int MAX_VALUE = 9;
    
        public static void main(String[] args) {
        	
            int n = 15;
            // 모든 원소의 값이 0보다 크거나 같다고 가정
            int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
            // 모든 범위를 포함하는 배열 선언(모든 값은 0으로 초기화)
            int[] cnt = new int[MAX_VALUE + 1];
    
            for (int i = 0; i < n; i++) {
                cnt[arr[i]] += 1; // 각 데이터에 해당하는 인덱스의 값 증가
            }
            for (int i = 0; i <= MAX_VALUE; i++) { // 배열에 기록된 정렬 정보 확인
                for (int j = 0; j < cnt[i]; j++) {
                    System.out.print(i + " "); // 띄어쓰기를 기준으로 등장한 횟수만큼 인덱스 출력
                }
            }
        }
    
    }
    ```

    

- 정렬 문제 유형

  - 정렬 라이브러리로 풀 수 있는 문제
  - 정렬 알고리즘의 원리에 대해서 물어보는 문제
  - 더 빠른 정렬이 필요한 문제

  ```
  import java.util.*;
  
  public class Main {
  
      public static void main(String[] args) {
      	
          int n = 10;
          int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
  
          Arrays.sort(arr);
  
          for(int i = 0; i < n; i++) {
              System.out.print(arr[i] + " ");
          }
      }
  
  }
  ```

  ```
  import java.util.*;
  
  class Fruit implements Comparable<Fruit> {
  
      private String name;
      private int score;
  
      public Fruit(String name, int score) {
          this.name = name;
          this.score = score;
      }
  
      public String getName() {
          return this.name;
      }
  
      public int getScore() {
          return this.score;
      }
  
      // 정렬 기준은 '점수가 낮은 순서'
      @Override
      public int compareTo(Fruit other) {
          if (this.score < other.score) {
              return -1;
          }
          return 1;
      }
  }
  
  public class Main {
  
      public static void main(String[] args) {
          List<Fruit> fruits = new ArrayList<>();
  
          fruits.add(new Fruit("바나나", 2));
          fruits.add(new Fruit("사과", 5));
          fruits.add(new Fruit("당근", 3));
  
          Collections.sort(fruits);
  
          for (int i = 0; i < fruits.size(); i++) {
              System.out.print("(" + fruits.get(i).getName() + "," + fruits.get(i).getScore() + ") ");
          }
      }
  }
  ```