# **[ 정보 ]**
1. 소요 시간: 1시간 15분
    
        - 00:48 - 01:30 경우의 수 구하는 로직 설계 및 구현 (테스트 x)
        - 23:00 - 23:19 실패 ===> 실패 4개
        - 23:19 - 23:33 성공
             - 제곱근에 '+1' 을 추가해줌 ===> 초기값이 2이기 때문에 제곱근이 2이면 반복문이 동작하지 않음
2. 날짜: 2023.03.22(수)
3. 저자: 이 인복
4. 난이도: Programmers(Lv2)
5. 분류: 완전탐색   
6. 문제: 소수 찾기

# **[ 문제 설명 ]**
한자리 숫자가 적힌 종이 조각이 흩어져있습니다.  
흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.   
각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

# **[ 제한사항 ]**
- numbers는 길이 1 이상 7 이하인 문자열입니다.
- numbers는 0~9까지 숫자만으로 이루어져 있습니다.
- "013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.

# **[ 입출력 예 ]**
    numbers	    return
    "17"	      3
    "011"	      2   

# **[ 접근 순서 ]**
1. 각 각의 숫자를 이용해서 만들 수 있는 모든 경우의 수를 찾아야함
    - 재귀함수로 구현
        - 재귀함수가 끝나는 조건 설정
        - 숫자가 조합될 수 있는 로직 설정
        - 조합된 숫자를 보관할 콜렉션 객체 선정(HashSet)
            - 이유: 모든 경우의 수를 구할 때 중복되는 숫자가 많이 나옴
    - 트리 구조를 생각하며 구현(실제로 트리는 아님)
   

2. 구한 수에서 소수가 되는 수만 카운트 해야함
    - 제곱근을 이용한 소수 알고리즘 이용

# **[ 문제점 ]**
1. 잦은 String 연산으로 인한 효율성 저하
   - StringBuilder 클래슬 이용해서 불필요한 String 연산을 하지 않도록 변경 [2023.04.04 추가]


2. 매 메소드 스택 마다 new 연산으로 생성되는 boolean 타입의 visited 배열
   - 전역 변수로 둔 하나의 visited 배열만 이용 [2023.04.04 추가]

3. 매번 visited 배열이 전부 방문되었는지 확인하는 작업(반복문)
   - 매번 배열을 순회해서 true/false 여부를 체크하는 로직 삭제 후 전체적인 로직 새롭게 변경 [2023.04.04 추가]

# **[ 새로 알게된 사실 ]**
- 백트래킹 알고리즘에 대해서 조금 더 체계적으로 짤 수 있게 된것 같음
    - 내가 짠 소스코드보다 효율이 적게는 2배에서 많게는 4배까지 확인 해봤음 ===> input 의 사이즈에 따라서 비례하는 것 같음

# **[ 결과 ]**
<img width="600" height="300" alt="스크린샷 2023-03-22 오후 11 39 59" src="https://user-images.githubusercontent.com/59809278/226948325-dedbb8cf-1ddf-4475-8e81-c23b0e6c8632.png">  

<img width="600" height="300" alt="스크린샷 2023-04-04 오후 9 05 08" src="https://user-images.githubusercontent.com/59809278/229787944-7a6789fa-35c4-4535-b1d7-9ff103473563.png">  
  
[2023.04.04 추가된 새로운 로직의 결과]
