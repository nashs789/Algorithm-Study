# **[ 정보 ]**
1. 소요 시간: 1시간 8
2. 날짜: 2023.07.13(목)
3. 저자: 이 인복
4. 난이도: BaekJoon (Gold 4)
5. 분류: BackTracking
    - Implementation
    - Simulation
    - Brute Force
6. 문제: 감시

# **[ 문제 설명 ]**

<img width="1148" alt="스크린샷 2023-07-13 오전 2 12 36" src="https://github.com/nashs789/CodeTest/assets/59809278/76d2ebea-8095-4872-9110-45c95f446d58">

스타트링크의 사무실은 1×1크기의 정사각형으로 나누어져 있는 N×M 크기의 직사각형으로 나타낼 수 있다.   
사무실에는 총 K개의 CCTV가 설치되어져 있는데, CCTV는 5가지 종류가 있다.   
각 CCTV가 감시할 수 있는 방법은 다음과 같다.

<img width="1148" alt="스크린샷 2023-07-13 오전 2 13 48" src="https://github.com/nashs789/CodeTest/assets/59809278/86c0d8c4-762f-461b-bcac-4f773a731121">

1번 CCTV는 한 쪽 방향만 감시할 수 있다.   
2번과 3번은 두 방향을 감시할 수 있는데, 2번은 감시하는 방향이 서로 반대방향이어야 하고, 3번은 직각 방향이어야 한다.   
4번은 세 방향, 5번은 네 방향을 감시할 수 있다.

CCTV는 감시할 수 있는 방향에 있는 칸 전체를 감시할 수 있다.   
사무실에는 벽이 있는데, CCTV는 벽을 통과할 수 없다.   
CCTV가 감시할 수 없는 영역은 사각지대라고 한다.

CCTV는 회전시킬 수 있는데, 회전은 항상 90도 방향으로 해야 하며, 감시하려고 하는 방향이 가로 또는 세로 방향이어야 한다.

<img width="1148" alt="스크린샷 2023-07-13 오전 2 13 54" src="https://github.com/nashs789/CodeTest/assets/59809278/80c80c18-bc33-4522-b9c8-665665986459">

지도에서 0은 빈 칸, 6은 벽, 1~5는 CCTV의 번호이다. 위의 예시에서 1번의 방향에 따라 감시할 수 있는 영역을 '#'로 나타내면 아래와 같다.


CCTV는 벽을 통과할 수 없기 때문에, 1번이 → 방향을 감시하고 있을 때는 6의 오른쪽에 있는 칸을 감시할 수 없다.

    0 0 0 0 0 0
    0 2 0 0 0 0
    0 0 0 0 6 0
    0 6 0 0 2 0
    0 0 0 0 0 0
    0 0 0 0 0 5

위의 예시에서 감시할 수 있는 방향을 알아보면 아래와 같다.

<img width="1148" alt="스크린샷 2023-07-13 오전 2 14 00" src="https://github.com/nashs789/CodeTest/assets/59809278/ed065ae4-3110-4952-be7e-72551ec2987f">

CCTV는 CCTV를 통과할 수 있다. 아래 예시를 보자.

    0 0 2 0 3
    0 6 0 0 0
    0 0 6 6 0
    0 0 0 0 0

위와 같은 경우에 2의 방향이 ↕ 3의 방향이 ←와 ↓인 경우 감시받는 영역은 다음과 같다.

    # # 2 # 3
    0 6 # 0 #
    0 0 6 6 #
    0 0 0 0 #

사무실의 크기와 상태, 그리고 CCTV의 정보가 주어졌을 때, CCTV의 방향을 적절히 정해서, 사각 지대의 최소 크기를 구하는 프로그램을 작성하시오.

# **[ 입력 ]**
- 첫째 줄에 사무실의 세로 크기 N과 가로 크기 M이 주어진다. (1 ≤ N, M ≤ 8)
- 둘째 줄부터 N개의 줄에는 사무실 각 칸의 정보가 주어진다. 0은 빈 칸, 6은 벽, 1~5는 CCTV를 나타내고, 문제에서 설명한 CCTV의 종류이다.
- CCTV의 최대 개수는 8개를 넘지 않는다.

# **[ 출력 ]**
- 첫째 줄에 사각 지대의 최소 크기를 출력한다.

# **[ 예제 입력 #1 ]**
    4 6
    0 0 0 0 0 0
    0 0 0 0 0 0
    0 0 1 0 6 0
    0 0 0 0 0 0

# **[ 예제 출력 #1 ]**
    20

# **[ 예제 입력 #2 ]**
    6 6
    0 0 0 0 0 0
    0 2 0 0 0 0
    0 0 0 0 6 0
    0 6 0 0 2 0
    0 0 0 0 0 0
    0 0 0 0 0 5

# **[ 예제 출력 #2 ]**
    15

# **[ 예제 입력 #3 ]**
    6 6
    1 0 0 0 0 0
    0 1 0 0 0 0
    0 0 1 0 0 0
    0 0 0 1 0 0
    0 0 0 0 1 0
    0 0 0 0 0 1

# **[ 예제 출력 #3 ]**
    6

# **[ 예제 입력 #4 ]**
    6 6
    1 0 0 0 0 0
    0 1 0 0 0 0
    0 0 1 5 0 0
    0 0 5 1 0 0
    0 0 0 0 1 0
    0 0 0 0 0 1

# **[ 예제 출력 #4 ]**
    2

# **[ 예제 입력 #5 ]**
    1 7
    0 1 2 3 4 5 6

# **[ 예제 출력 #5 ]**
    0

# **[ 예제 입력 #6 ]**
    3 7
    4 0 0 0 0 0 0
    0 0 0 2 0 0 0
    0 0 0 0 0 0 4

# **[ 예제 출력 #6 ]**
    0

# **[ 접근 순서 ]**
1. cctv 를 List 형식으로 보관
    - 매번 cctv 의 위치를 탐색 하는 것 보다 인덱스를 통해서 꺼내는게 좋겠다고 생각
    

2. 5번 타입 CCTV 별도 처리
    - 5번 타입의 경우 90도로 돌려도 항상 4방향 감시를 하기 때문에 알고리즘 실행 전에 미리 처리 해놓는다.
    - 백트래킹 알고리즘 실행시 cctv list 에 들어있지 않아서 5번 타입이 많은 경우 많은 시간 절약 예상
    

3. 감시(up, down, left, right -> 0, 1, 2, 3)
    - 감시를 하게 되면 해당하는 줄로 일자로 감시중인 '7' 로 배열을 채운다.
    - switch 문에 보면 분기처리로 onSurveillance 메소드를 호출 하는데 더 좋은 방법을 찾지 못했다...

# **[ 문제점 & 주의점 ]**

# **[ 새로 알게된 사실 ]**

# **[ 결과 ]**
<img width="1148" alt="스크린샷 2023-07-13 오전 2 12 42" src="https://github.com/nashs789/CodeTest/assets/59809278/37e8c8a9-52e1-429b-9aaa-421d0ccdadcc">
