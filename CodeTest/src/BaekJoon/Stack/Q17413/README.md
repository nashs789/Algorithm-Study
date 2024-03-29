# **[ 정보 ]**
1. 소요 시간: 32분
2. 날짜: 2023.06.20(화)
3. 저자: 이 인복
4. 난이도: BaekJoon (Silver 3)
5. 분류: Stack
    - Data Structure
    - String
    - Implementation
6. 문제: 단어 뒤집기2

# **[ 문제 설명 ]**

<img width="1147" alt="스크린샷 2023-06-20 오후 11 30 02" src="https://github.com/nashs789/CodeTest/assets/59809278/ca93df6d-224a-42c6-85ac-f86c0bfa6850">

문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.

먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.

1. 알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
2. 문자열의 시작과 끝은 공백이 아니다.
3. '<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.

태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고, '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다.   
단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고, 연속하는 두 단어는 공백 하나로 구분한다.   
태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.

# **[ 입력 ]**
- 첫째 줄에 문자열 S가 주어진다. S의 길이는 100,000 이하이다.

# **[ 출력 ]**
- 첫째 줄에 문자열 S의 단어를 뒤집어서 출력한다.

# **[ 예제 입력 #1 ]**
      baekjoon online judge

# **[ 예제 출력 #1 ]**
      noojkeab enilno egduj

# **[ 예제 입력 #2 ]**
      <open>tag<close>

# **[ 예제 출력 #2 ]**
      <open>gat<close>

# **[ 예제 입력 #3 ]**
      <ab cd>ef gh<ij kl>

# **[ 예제 출력 #3 ]**
      <ab cd>fe hg<ij kl>

# **[ 예제 입력 #4 ]**
      one1 two2 three3 4fourr 5five 6six

# **[ 예제 출력 #4 ]**
      1eno 2owt 3eerht rruof4 evif5 xis6

# **[ 예제 입력 #5 ]**
      <int><max>2147483647<long long><max>9223372036854775807

# **[ 예제 출력 #5 ]**
      <int><max>7463847412<long long><max>7085774586302733229

# **[ 예제 입력 #6 ]**
      <problem>17413<is hardest>problem ever<end>

# **[ 예제 출력 #6 ]**
      <problem>31471<is hardest>melborp reve<end>

# **[ 예제 입력 #7 ]**
      <   space   >space space space<    spa   c e>

# **[ 예제 출력 #7 ]**
      <   space   >ecaps ecaps ecaps<    spa   c e>

# **[ 접근 순서 ]**
1. 문자열에서 '<', '>' 괄화와 비괄호 문자를 구분함
   - <문자>: 태그
   - 문자  : 단어
   

2. 태그로 구분되는 문자열은 Queue 에 넣는다.
   - 태그는 문자열을 뒤집지 않기 때문이다.
      - ex1) \<open\> -> \<open\>
      - ex2) open -> nepo
   

3. 일반 문자열은 stack 에 넣는다.
   - 문자열은 뒤집어야 하기 때문이다. (선입 후출 자료구조이기 때문에 자연스럽게 뒤집을 수 있음)

         ex) push(o)
             push(p) 
             push(e) 
             push(n)
   
             pop() x 4 ===> nepo
   

4. ' '(공백)
   - 공백은 뒤집는 것과는 무관하게 별개로 진행


# **[ 문제점 & 주의점 ]**

# **[ 새로 알게된 사실 ]**

# **[ 결과 ]**
<img width="1147" alt="스크린샷 2023-06-20 오후 11 30 15" src="https://github.com/nashs789/CodeTest/assets/59809278/290a9926-ed0e-4c52-8d7d-42229d25a977">
