# **[ 정보 ]**
1. 소요 시간: 50분
2. 날짜: 2023.02.24(금)
3. 저자: 이 인복
4. 난이도: 실버 2
5. 분류: 문자열
6. 문제: A -> B

# **[ 문제 설명 ]**

<img width="1147" alt="스크린샷 2023-02-24 오전 12 10 46" src="https://user-images.githubusercontent.com/59809278/220948472-d39e3d73-dd64-431a-9615-f356a788e422.png">

정수 A를 B로 바꾸려고 한다. 가능한 연산은 다음과 같은 두 가지이다.

- 2를 곱한다.
- 1을 수의 가장 오른쪽에 추가한다.

A를 B로 바꾸는데 필요한 연산의 최솟값을 구해보자.

# **[ 입력 ]**
첫째 줄에 A, B (1 ≤ A < B ≤ 109)가 주어진다.

# **[ 출력 ]**
A를 B로 바꾸는데 필요한 연산의 최솟값에 1을 더한 값을 출력한다.   
만들 수 없는 경우에는 -1을 출력한다.

# **[ 예제 입력 #1 ]**
    2 162
# **[ 예제 출력 #1 ]**
    5
# **[ 예제 입력 #2 ]**
    4 42
# **[ 예제 출력 #2 ]**
    -1
# **[ 예제 입력 #3 ]**
    100 40021
# **[ 예제 출력 #3 ]**
    5

# **[ 접근 순서 ]**
1. A에서 B로 접근하는 방법은 방법이 너무 많아서 힘들다고 판단하여 B에서 A로 접근

2 - 1. 맨 뒤의 숫자가 1이 오는경우 1제거 후 자릿 수 축소

2 - 2. 짝수인 경우 나누기 2 (곱하기 2 or 더하기 1 조건 떄문에 홀수는 1 제외하고는 불가능하다)

2 - 3. 1을 제외한 홀수 or 나눠서 1이 될 경우(마지막 수) 종료

3. B가 A와 동일할 경우 정상 종료

# **[ 문제점 ]**

# **[ 새로 알게된 사실 ]**

# **[ 결과 ]**
<img width="1147" alt="스크린샷 2023-02-24 오전 12 15 29" src="https://user-images.githubusercontent.com/59809278/220948492-963e224c-cdeb-4db8-bb68-6751ed9944e4.png">