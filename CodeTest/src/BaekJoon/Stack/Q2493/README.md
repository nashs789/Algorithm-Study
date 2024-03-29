# **[ 정보 ]**
1. 소요 시간: 33분
2. 날짜: 2023.06.18(일)
3. 저자: 이 인복
4. 난이도: BaekJoon (Gold 5)
5. 분류: Stack
    - Data Structure
6. 문제: 탑

# **[ 문제 설명 ]**

<img width="1146" alt="스크린샷 2023-06-18 오전 2 10 02" src="https://github.com/nashs789/CodeTest/assets/59809278/aebe40e6-82aa-41fe-9c31-a7f672fffe47">

KOI 통신연구소는 레이저를 이용한 새로운 비밀 통신 시스템 개발을 위한 실험을 하고 있다.  
실험을 위하여 일직선 위에 N개의 높이가 서로 다른 탑을 수평 직선의 왼쪽부터 오른쪽 방향으로 차례로 세우고, 각 탑의 꼭대기에 레이저 송신기를 설치하였다.   
모든 탑의 레이저 송신기는 레이저 신호를 지표면과 평행하게 수평 직선의 왼쪽 방향으로 발사하고, 탑의 기둥 모두에는 레이저 신호를 수신하는 장치가 설치되어 있다.  
하나의 탑에서 발사된 레이저 신호는 가장 먼저 만나는 단 하나의 탑에서만 수신이 가능하다.

예를 들어 높이가 6, 9, 5, 7, 4인 다섯 개의 탑이 수평 직선에 일렬로 서 있고, 모든 탑에서는 주어진 탑 순서의 반대 방향(왼쪽 방향)으로 동시에 레이저 신호를 발사한다고 하자.  
그러면, 높이가 4인 다섯 번째 탑에서 발사한 레이저 신호는 높이가 7인 네 번째 탑이 수신을 하고, 높이가 7인 네 번째 탑의 신호는 높이가 9인 두 번째 탑이, 높이가 5인 세 번째 탑의 신호도 높이가 9인 두 번째 탑이 수신을 한다.  
높이가 9인 두 번째 탑과 높이가 6인 첫 번째 탑이 보낸 레이저 신호는 어떤 탑에서도 수신을 하지 못한다.

탑들의 개수 N과 탑들의 높이가 주어질 때, 각각의 탑에서 발사한 레이저 신호를 어느 탑에서 수신하는지를 알아내는 프로그램을 작성하라.

# **[ 입력 ]**
- 첫째 줄에 탑의 수를 나타내는 정수 N이 주어진다.   
- N은 1 이상 500,000 이하이다.  
- 둘째 줄에는 N개의 탑들의 높이가 직선상에 놓인 순서대로 하나의 빈칸을 사이에 두고 주어진다.   
- 탑들의 높이는 1 이상 100,000,000 이하의 정수이다.

# **[ 출력 ]**
- 첫째 줄에 주어진 탑들의 순서대로 각각의 탑들에서 발사한 레이저 신호를 수신한 탑들의 번호를 하나의 빈칸을 사이에 두고 출력한다.   
- 만약 레이저 신호를 수신하는 탑이 존재하지 않으면 0을 출력한다.

# **[ 예제 입력 #1 ]**
      5
      6 9 5 7 4

# **[ 예제 출력 #1 ]**
      0 0 2 2 4

# **[ 접근 순서 ]**
1. 스택에 Top 을 계속해서 Insert
   - 이전에 넣은 Top 의 크기가 현재 Top 보다 작다면 pop() 으로 삭제
      - 더 큰 Top 이 있다면 신호를 수신하기 때문에 그 뒤에 탑은 필요 없음(Stack 으로 문제를 풀 수 있는 이유)

2. Top 클래스
   - Top 의 Index 정보와 Height 정보가 필요하기 때문에
        
       
            ◀︎⎯⎯⎯⎯⎯⎯🀆 
                       🀆 
                       🀆◀︎⎯⎯⎯︎⎯⎯⎯⎯⎯⎯⎯🀆 
            ◀⎯🀆       🀆                 🀆
              🀆        🀆                 🀆
              🀆        🀆◀︎⎯⎯⎯⎯🀆        🀆    
              🀆        🀆        🀆        🀆◀︎⎯⎯⎯⎯🀆
              🀆        🀆        🀆        🀆        🀆
              🀆        🀆        🀆        🀆        🀆
              🀆        🀆        🀆        🀆        🀆
              6        9        5         7        4

# **[ 문제점 & 주의점 ]**

# **[ 새로 알게된 사실 ]**

# **[ 결과 ]**
<img width="1142" alt="스크린샷 2023-06-18 오전 2 10 13" src="https://github.com/nashs789/CodeTest/assets/59809278/9057ff61-3d5a-48c1-ba34-24924f589af1">
