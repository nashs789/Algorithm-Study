# **[ 정보 ]**
1. 소요 시간: 25분
2. 날짜: 2023.05.07(일)
3. 저자: 이 인복
4. 난이도: BaekJoon (Silver 4)
5. 분류: Stack
6. 문제: 스택

# **[ 문제 설명 ]**

<img width="1150" alt="스크린샷 2023-05-07 오전 2 42 06" src="https://user-images.githubusercontent.com/59809278/236639080-9f24ba57-615d-43a6-81b0-15fae5a1c1e8.png">

정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

- push X: 정수 X를 스택에 넣는 연산이다.
- pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
- size: 스택에 들어있는 정수의 개수를 출력한다.
- empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
- top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

# **[ 입력 ]**
첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다.   
둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.   
주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.   
문제에 나와있지 않은 명령이 주어지는 경우는 없다.

# **[ 출력 ]**
출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

# **[ 예제 입력 #1 ]**
      14
      push 1
      push 2
      top
      size
      empty
      pop
      pop
      pop
      size
      empty
      pop
      push 3
      empty
      top

# **[ 예제 출력 #1 ]**
      2
      2
      0
      2
      1
      -1
      0
      1
      -1
      0
      3

# **[ 예제 입력 #2 ]**
      7
      pop
      top
      push 123
      top
      pop
      top
      pop

# **[ 예제 출력 #2 ]**
      -1
      -1
      123
      123
      -1
      -1

# **[ 접근 순서 ]**
1. 처음으로 구현해본 스택!!!
   - 예전에 공부한 기억을 토대로 작성했는데 생각보다 나쁘지 않게 진행되었다.
   - 중요 포인트는 배열의 크기를 늘리는 기준이 아닐까? 싶다.

# **[ 문제점 & 주의점 ]**

# **[ 새로 알게된 사실 ]**

# **[ 결과 ]**
<img width="1150" alt="스크린샷 2023-05-07 오전 2 42 14" src="https://user-images.githubusercontent.com/59809278/236639083-0c0f2970-5912-46c3-8c52-47b97c850cea.png">
