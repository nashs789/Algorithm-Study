# **[ 정보 ]**
1. 소요 시간: 1시간 5분
2. 날짜: 2023.02.02(목)
3. 저자: 이 인복
4. 문제: 2667번 단지 번호 붙이기

[ 문제 ]  
<그림 1>과 같이 정사각형 모양의 지도가 있다.   
1은 집이 있는 곳을, 0은 집이 없는 곳을 나타낸다.  
철수는 이 지도를 가지고 연결된 집의 모임인 단지를 정의하고, 단지에 번호를 붙이려 한다.   
여기서 연결되었다는 것은 어떤 집이 좌우, 혹은 아래위로 다른 집이 있는 경우를 말한다.   
대각선상에 집이 있는 경우는 연결된 것이 아니다.   
<그림 2>는 <그림 1>을 단지별로 번호를 붙인 것이다.   
지도를 입력하여 단지수를 출력하고, 각 단지에 속하는 집의 수를 오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.
<img width="1155" alt="스크린샷 2023-02-02 오후 9 23 19" src="https://user-images.githubusercontent.com/59809278/216328362-9824746c-fbcf-4126-803a-eb6f01ed8ffc.png">

[ 입력 ]  
첫 번째 줄에는 지도의 크기 N(정사각형이므로 가로와 세로의 크기는 같으며 5≤N≤25)이 입력되고,   
그 다음 N줄에는 각각 N개의 자료(0혹은 1)가 입력된다.

[ 출력 ]  
첫 번째 줄에는 총 단지수를 출력하시오.   
그리고 각 단지내 집의 수를 오름차순으로 정렬하여 한 줄에 하나씩 출력하시오.

[ 예제 입력 ]  
7  
0110100   
0110101   
1110101   
0000111   
0100000   
0111110   
0111000

[ 예제 출력 ]  
3   
7   
8   
9

# **[ 접근 순서 ]**
1. 노드 연결 어떻게 할까?
- 좌표가 아닌 번호로 노드를 취급
    - {1, 1}, {1, 2}   (x)
    - 1, 2, 3, 4, 5    (o)
    
- 상, 하, 좌, 우 노드 연결
    - 빈 집일경우 노드 연결에서 제외

2. 아파트 단지 카운트
    - BFS 로직 한 번 수행시 카운트
    - 시작 노드는 모든 노드 차례로 빈 노드가 아닐경우 실행  

    
3. 아파트 단지 내부의 아파트 개수 카운트
    - BFS 로직 시행시 Queue 시작 노드 결정 시 카운트

# **[ 문제점 ]**

# **[ 새로 알게된 사실 ]**

# **[ 결과 ]**
<img width="1143" alt="스크린샷 2023-02-02 오후 9 23 01" src="https://user-images.githubusercontent.com/59809278/216328382-796dbfb8-5c93-448d-a1fb-8301ed740f95.png">




         
