# **[ 정보 ]**
1. 소요 시간: 48분
2. 날짜: 2023.07.21(금)
3. 저자: 이 인복
4. 난이도: BaekJoon (Gold 4)
5. 분류: Breadth First Search
    - Graph Theory
    - Graph Search
6. 문제: 숨바꼭질 4

# **[ 문제 설명 ]**

<img width="1141" alt="스크린샷 2023-07-21 오후 4 59 14" src="https://github.com/nashs789/CodeTest/assets/59809278/29c0689f-0af5-4b52-9556-83e12225ffc7">

수빈이는 동생과 숨바꼭질을 하고 있다.   
수빈이는 현재 점 N(0 ≤ N ≤ 100,000)에 있고, 동생은 점 K(0 ≤ K ≤ 100,000)에 있다.   
수빈이는 걷거나 순간이동을 할 수 있다.   
만약, 수빈이의 위치가 X일 때 걷는다면 1초 후에 X-1 또는 X+1로 이동하게 된다.   
순간이동을 하는 경우에는 1초 후에 2*X의 위치로 이동하게 된다.

수빈이와 동생의 위치가 주어졌을 때, 수빈이가 동생을 찾을 수 있는 가장 빠른 시간이 몇 초 후인지 구하는 프로그램을 작성하시오.

# **[ 입력 ]**
- 첫 번째 줄에 수빈이가 있는 위치 N과 동생이 있는 위치 K가 주어진다. N과 K는 정수이다.

# **[ 출력 ]**
- 첫째 줄에 수빈이가 동생을 찾는 가장 빠른 시간을 출력한다.
- 둘째 줄에 어떻게 이동해야 하는지 공백으로 구분해 출력한다.

# **[ 예제 입력 #1 ]**
      5 17  

# **[ 예제 출력 #1 ]**
      4
      5 10 9 18 17

# **[ 예제 입력 #1 ]**
      5 17  

# **[ 예제 출력 #1 ]**
      4
      5 4 8 16 17

# **[ 접근 순서 ]**
1. 일반적인 BFS 문제 + 경로를 어떻게 관리할 것인가?
   - visited 처리 하기 때문에 한 번 방문한 노드는 다른 노드가 방문하지 않기 때문에 int[] path 를 이용
   - 1 -> 2 이동시 path[2] = 1 로 이전 노드 번호를 담고 있어서 역순으로 path 구할 수 있음
   

2. while 문을 2개 두어서 time 증가
   - 동시간 노드들 일괄 처리 후 새로운 노드들 추가

# **[ 문제점 & 주의점 ]**
1. 자력으로 짰던 로직은 path 배열을 계속 생성하기 때문에 메모리 + 시간 둘 다 효율이 좋지 않았음

# **[ 새로 알게된 사실 ]**

# **[ 결과 ]**
<img width="1141" alt="스크린샷 2023-07-21 오후 4 59 24" src="https://github.com/nashs789/CodeTest/assets/59809278/80c717ce-d511-4bbb-b628-251ec14f4f3f">
