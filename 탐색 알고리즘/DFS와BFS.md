# 나의 코딩 테스트 준비...

> 여기서는 프로그래머스 공부랑...
> 코테 준비를 위한 서적을 참고해서...

<hr />

### DFS

- `Depth-First Search`

  > 특정한 경로로 탐색하다가 특정한 상황에서 최대한 깊숙이 들어가서 노드를 방문한 후, 다시 돌아가 다른 경로로 탐색하는 알고리즘

  + 깊이 우선 탐색
  + 재귀함수를 이용해서 구현

  - 그래프에서 깊은 부분을 우선적으로 탐색하는 알고리즘
  - 그래프란?
    - 노드와 간선으로 표현된 자료구조
    - 노드 == 정점


  - 그래프 탐색
    + 하나의 노드를 시작으로 다수의 노드를 방문하는 것

  - 인접하다
    + 두 노드가 간선으로 연결되어 있음

  - 그래프의 구현방법

    + 인접 행렬 `Adjacency Matrix`

      + 2차원 배열로 그래프의 연결 관계를 표현하는 방식

      + 모든 관계를 저장하므로 노드 개수가 많을 경우 메모리가 불필요하게 낭비됨

        ```java
        int[][] data = {
            {1,2,3}.
            {2,3,4},
            {3,4,5}
        };
        ```

    + 인접 리스트 `Adjacency List`

      - 리스트로 그래프의 연결 관계를 표현하는 방식
      - 모든 노드에 연결된 노드에 대한 정보를 차례대로 연결하여 저장
      - 특정한 두 노드가 연결되어 있는지에 대한 정보를 얻는 속도가 느림

  - 스택 자료구조를 이용한 DFS 구조

    1. 탐색 시작 노드를 스택에 삽입하고 방문 처리

    2. 스택의 최상단 노드에 방문하지 않은 인접 노드가 있으면 그 인접 노드를 스택에 넣고 방문 처리, 방문하지 않은 인접 노드가 없으면 스택에서 최상단 노드를 꺼냄

    3.  1,2 번의 과정을 더 이상 수행할 수 없을 때까지 반복

       ```java
       import java.util.*;
       
       public class Main {
       
           public static boolean[] visited = new boolean[9];
           public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
       
           // DFS 함수 정의
           public static void dfs(int x) {
               // 현재 노드를 방문 처리
               visited[x] = true;
               System.out.print(x + " ");
               // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
               for (int i = 0; i < graph.get(x).size(); i++) {
                   int y = graph.get(x).get(i);
                   if (!visited[y]) dfs(y);
               }
           }
       
           public static void main(String[] args) {
               // 그래프 초기화
               for (int i = 0; i < 9; i++) {
                   graph.add(new ArrayList<Integer>());
               }
       
               // 노드 1에 연결된 노드 정보 저장 
               graph.get(1).add(2);
               graph.get(1).add(3);
               graph.get(1).add(8);
               
               // 노드 2에 연결된 노드 정보 저장 
               graph.get(2).add(1);
               graph.get(2).add(7);
               
               // 노드 3에 연결된 노드 정보 저장 
               graph.get(3).add(1);
               graph.get(3).add(4);
               graph.get(3).add(5);
               
               // 노드 4에 연결된 노드 정보 저장 
               graph.get(4).add(3);
               graph.get(4).add(5);
               
               // 노드 5에 연결된 노드 정보 저장 
               graph.get(5).add(3);
               graph.get(5).add(4);
               
               // 노드 6에 연결된 노드 정보 저장 
               graph.get(6).add(7);
               
               // 노드 7에 연결된 노드 정보 저장 
               graph.get(7).add(2);
               graph.get(7).add(6);
               graph.get(7).add(8);
               
               // 노드 8에 연결된 노드 정보 저장 
               graph.get(8).add(1);
               graph.get(8).add(7);
       
               dfs(1);
           }
       
       }
       ```

       

**BFS**

- `Breadth First Search`

  + 너비 우선 탐색
  + 큐 자료구조를 이용해서 구현
  + 가까운 노드부터 탐색하는 알고리즘
    + 선입선출 방식인 큐 자료구조를 이용

  + 큐 자료구조를 이용한 BFS 구조
    1. 탐색 시작 노드를 큐에 삽입하고 방문 처리
    2. 큐에서 노드를 꺼내 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 모두 큐에 삽입하고 방문 처리
    3. 1,2번의 과정을 더 이상 수행할 수 없을 때까지 반복

```java
import java.util.*;

public class Main {

    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    // BFS 함수 정의
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        // 현재 노드를 방문 처리
        visited[start] = true;
        // 큐가 빌 때까지 반복
        while(!q.isEmpty()) {
            // 큐에서 하나의 원소를 뽑아 출력
            int x = q.poll();
            System.out.print(x + " ");
            // 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
            for(int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if(!visited[y]) {
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        // 그래프 초기화
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // 노드 1에 연결된 노드 정보 저장 
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);
        
        // 노드 2에 연결된 노드 정보 저장 
        graph.get(2).add(1);
        graph.get(2).add(7);
        
        // 노드 3에 연결된 노드 정보 저장 
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);
        
        // 노드 4에 연결된 노드 정보 저장 
        graph.get(4).add(3);
        graph.get(4).add(5);
        
        // 노드 5에 연결된 노드 정보 저장 
        graph.get(5).add(3);
        graph.get(5).add(4);
        
        // 노드 6에 연결된 노드 정보 저장 
        graph.get(6).add(7);
        
        // 노드 7에 연결된 노드 정보 저장 
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);
        
        // 노드 8에 연결된 노드 정보 저장 
        graph.get(8).add(1);
        graph.get(8).add(7);

        bfs(1);
    }

}
```

