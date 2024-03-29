# **[ 정보 ]**
1. 소요 시간: 2시간 24분
2. 날짜: 2023.01.30(월)
3. 저자: 이 인복

# **[ 신경 썼던 케이스 ]**

# **[ 접근 순서 ]**
**1. 가장 최소값을 가질 수 있는 케이스**
- 주유 가격이 낮은 도시에서 높은 도시의 충전량까지 미리 주유한다.
- 다음 충전 도시는 현재 도시보다 주유 가격이 낮은 도시로 한다.


![스케치](https://user-images.githubusercontent.com/59809278/215488704-cd7075a3-bb8a-4cb7-87e8-de8b21ca07a6.png)

![start](https://user-images.githubusercontent.com/59809278/215488723-eac67acd-3b91-4d25-803c-83f37f0312e9.png)


# **[ 문제점 ]**
- 로직 변경 (시간 vs 메모리, 코드 라인) ===> 차이는 정말 작음 신경 안써도됨

[ 1번 로직 ]

- 현재 도시에서 다음으로 주유 가격이 싼 도시까지의 거리를 누적 시키는 accKm 변수가 존재 했었음 ===> 삭제 

<img width="458" alt="스크린샷 2023-01-30 오후 10 11 36" src="https://user-images.githubusercontent.com/59809278/215488076-4cceb960-5800-4943-8448-944a5dc7ec37.png">

[ 2번 로직 ]

<img width="458" alt="스크린샷 2023-01-30 오후 10 11 45" src="https://user-images.githubusercontent.com/59809278/215488108-35ac4354-15b1-48f0-89c2-d4e815f82795.png">

# **[ 새로 알게된 사실 ]**

# **[ 결과 ]**
[ 1번 로직 ]
<img width="1117" alt="스크린샷 2023-01-30 오후 10 15 37" src="https://user-images.githubusercontent.com/59809278/215487751-c820eac1-b51d-4c4f-be63-a9f92602d8ce.png">

[ 2번 로직 ]
<img width="1117" alt="스크린샷 2023-01-30 오후 10 12 15" src="https://user-images.githubusercontent.com/59809278/215487651-b905bfb8-d5b9-4879-9df0-e5ca3fa37bec.png">
