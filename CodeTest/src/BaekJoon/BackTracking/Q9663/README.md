# **[ 정보 ]**
1. 소요 시간: 42분
2. 날짜: 2023.05.18(목)
3. 저자: 이 인복
4. 난이도: BaekJoon (Gold 4)
5. 분류: BackTracking
6. 문제: N-Queen

# **[ 문제 설명 ]**

<img width="1153" alt="스크린샷 2023-05-18 오전 12 29 27" src="https://github.com/nashs789/CodeTest/assets/59809278/8929d865-a487-4b9a-ad0d-972bd80a9389">

N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.

N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.

# **[ 입력 ]**
첫째 줄에 N이 주어진다. (1 ≤ N < 15)

# **[ 출력 ]**
첫째 줄에 퀸 N개를 서로 공격할 수 없게 놓는 경우의 수를 출력한다.

# **[ 예제 입력 #1 ]**
    8

# **[ 예제 출력 #1 ]**
    92

# **[ 접근 순서 ]**
1. 좌표상에서 서로 공격할 수 없는 케이스 정의
    - 같은 x, y축 좌표에 존재하지 않음
    - 양쪽 대각선 라인에 존재하지 않음
    - 결론: 8각에 다른 퀸이 존재하지 않는 경우에만 만족한다.

 ![KakaoTalk_Photo_2023-05-18-00-30-55](https://github.com/nashs789/CodeTest/assets/59809278/800580ce-82c2-4202-917e-6bc45f85fa0d)

# **[ 문제점 & 주의점 ]**

# **[ 새로 알게된 사실 ]**
1. 알고리즘 책에 나와있는 예시 문제라서 어렵지 않게 풀었다.

# **[ 결과 ]**
<img width="1153" alt="스크린샷 2023-05-18 오전 12 29 34" src="https://github.com/nashs789/CodeTest/assets/59809278/8c464dd8-b6dc-4fb0-a49e-aed3a0ac4f3e">
