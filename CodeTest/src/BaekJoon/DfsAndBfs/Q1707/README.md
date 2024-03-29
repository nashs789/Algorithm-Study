# **[ 정보 ]**
1. 소요 시간: 42분
2. 날짜: 2023.02.27(월)
3. 저자: 이 인복
4. 난이도: BaekJoon (Gold 4)
5. 분류: BFS/DFS
6. 문제: 이분 그래프

# **[ 문제 설명 ]**

<img width="1147" alt="스크린샷 2023-02-27 오후 11 12 29" src="https://user-images.githubusercontent.com/59809278/221586441-f2f58bea-6c3d-44fc-977e-b43410399563.png">

그래프의 정점의 집합을 둘로 분할하여, 각 집합에 속한 정점끼리는 서로 인접하지 않도록 분할할 수 있을 때, 그러한 그래프를 특별히 이분 그래프 (Bipartite Graph) 라 부른다.

그래프가 입력으로 주어졌을 때, 이 그래프가 이분 그래프인지 아닌지 판별하는 프로그램을 작성하시오.

# **[ 입력 ]**
입력은 여러 개의 테스트 케이스로 구성되어 있는데, 첫째 줄에 테스트 케이스의 개수 K가 주어진다.   
각 테스트 케이스의 첫째 줄에는 그래프의 정점의 개수 V와 간선의 개수 E가 빈 칸을 사이에 두고 순서대로 주어진다.  
각 정점에는 1부터 V까지 차례로 번호가 붙어 있다.   
이어서 둘째 줄부터 E개의 줄에 걸쳐 간선에 대한 정보가 주어지는데, 각 줄에 인접한 두 정점의 번호 u, v (u ≠ v)가 빈 칸을 사이에 두고 주어진다.

# **[ 출력 ]**
K개의 줄에 걸쳐 입력으로 주어진 그래프가 이분 그래프이면 YES, 아니면 NO를 순서대로 출력한다.

# **[ 예제 입력 #1 ]**
    2
    3 2
    1 3
    2 3
    4 4
    1 2
    2 3
    3 4
    4 2

# **[ 예제 출력 #1 ]**
    YES
    NO

# **[ 접근 순서 ]**
1. 방문, 그룹1, 그룹2 총 3가지 상태로 노드를 구분 짓는다.

2 - 1. 방문하지 않은 노드는 방문하면서 그룹을 정한다. (현재 방문한 그룹의 반대 그룹으로 결정 짓는다.)

2 - 2. 방문여부와 상관없이 인접 노드가 현재 노드의 그룹과 동일한 그룹 이라면 종료 시킨다. (이분 그래프가 아님)

3. 중간에 종료되지 않는다면, 이분 그래프로 간주한다.

# **[ 문제점 & 주의점 ]**
- 그래프가 여러개일 경우도 계산 해야한다. (모든 노드가 간선으로 이어져 있다는 생각 위험)

# **[ 새로 알게된 사실 ]**
- for 문이 중첩될 경우 이름을 지어서 종료시킬 수 있음

# **[ 결과 ]**
<img width="1147" alt="스크린샷 2023-02-27 오후 11 12 39" src="https://user-images.githubusercontent.com/59809278/221586464-465a076e-76b1-476f-be42-d835503336e8.png">
