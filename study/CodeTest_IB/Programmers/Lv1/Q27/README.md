# **[ 정보 ]**
1. 소요 시간: 18:13 - 19:19 (66분) 
2. 날짜: 2023.01.12(목)
3. 저자: 이 인복

# **[ 접근 순서 ]**
**1. 그림으로 좌표 설정**
     - 키패드 좌표를 그림으로 이해
    
    ` 1(0, 0)    2(0, 1)    3(0, 2)`
   
    ` 4(0, 0)    5(0, 1)    6(0, 2)`
   
    ` 7(0, 0)    8(0, 1)    9(0, 2)`
   
    ` *(0, 0)    0(0, 1)    #(0, 2)`


**2. 자료구조 선정** 
- 키패드 번호와 좌표를 저장할 자료구조 선정 (배열 vs 맵) 
  

- 맵 채택 이유: 키패드의 Integer 타입 이지만 번호는 변경되지 않는 조건이 붙어 있어서 고유한 값 유지 가능


- 좌표: 좌표 클래스 Point 만들어서 저장 


**3. 메소드 모듈화**
- intiKeypadMap(Map<Integer, Point> keypadMap): 키패드 초기화 메소드
    

- setHandPoint(Point target, Point from): 좌표 새로운 좌표로 초기화 메소드


- getDistance(Point target, Point from): 좌표들 사이의 거리 구하는 메소드
    - 절대 값(x1 - x2) + 절대 값(y1 - y2 ) = 좌표 사이의 거리


- getMoveHand(Point target, Point left, Point right, String hand): 키패드를 누르는 손에 대한 정보 구하는 메소드
    
# **[ 문제점 ]**
문제점은 없었고, 구조 잡고, 로직 고민하는데 시간이 들었음

# **[ 새로 알게된 사실 ]**

# **[ 결과 ]**
<img width="427" alt="스크린샷 2023-01-15 오전 11 08 14" src="https://user-images.githubusercontent.com/59809278/212517330-110aa846-7439-4736-9266-f509d645cc83.png">

         
