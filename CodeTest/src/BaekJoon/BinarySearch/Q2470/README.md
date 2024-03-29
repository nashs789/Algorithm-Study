# **[ 정보 ]**
1. 소요 시간: 33분
2. 날짜: 2023.05.31(수)
3. 저자: 이 인복
4. 난이도: BaekJoon (Gold 4)
5. 분류: Binary Search
      - Two Pointers
      - Sorting
6. 문제: 두 용액

# **[ 문제 설명 ]**

<img width="1153" alt="스크린샷 2023-05-31 오후 11 03 11" src="https://github.com/nashs789/CodeTest/assets/59809278/dcd01df9-6ed7-415e-916e-cd4160862c86">

KOI 부설 과학연구소에서는 많은 종류의 산성 용액과 알칼리성 용액을 보유하고 있다.   
각 용액에는 그 용액의 특성을 나타내는 하나의 정수가 주어져있다.   
산성 용액의 특성값은 1부터 1,000,000,000까지의 양의 정수로 나타내고, 알칼리성 용액의 특성값은 -1부터 -1,000,000,000까지의 음의 정수로 나타낸다.

같은 양의 두 용액을 혼합한 용액의 특성값은 혼합에 사용된 각 용액의 특성값의 합으로 정의한다.  
이 연구소에서는 같은 양의 두 용액을 혼합하여 특성값이 0에 가장 가까운 용액을 만들려고 한다.

예를 들어, 주어진 용액들의 특성값이 [-2, 4, -99, -1, 98]인 경우에는 특성값이 -99인 용액과 특성값이 98인 용액을 혼합하면 특성값이 -1인 용액을 만들 수 있고, 이 용액이 특성값이 0에 가장 가까운 용액이다.   
참고로, 두 종류의 알칼리성 용액만으로나 혹은 두 종류의 산성 용액만으로 특성값이 0에 가장 가까운 혼합 용액을 만드는 경우도 존재할 수 있다.

산성 용액과 알칼리성 용액의 특성값이 주어졌을 때, 이 중 두 개의 서로 다른 용액을 혼합하여 특성값이 0에 가장 가까운 용액을 만들어내는 두 용액을 찾는 프로그램을 작성하시오.

# **[ 입력 ]**
- 첫째 줄에는 전체 용액의 수 N이 입력된다. N은 2 이상 100,000 이하이다.   
- 둘째 줄에는 용액의 특성값을 나타내는 N개의 정수가 빈칸을 사이에 두고 주어진다.   
- 이 수들은 모두 -1,000,000,000 이상 1,000,000,000 이하이다. N개의 용액들의 특성값은 모두 다르고, 산성 용액만으로나 알칼리성 용액만으로 입력이 주어지는 경우도 있을 수 있다.

# **[ 출력 ]**
첫째 줄에 특성값이 0에 가장 가까운 용액을 만들어내는 두 용액의 특성값을 출력한다.   
출력해야 하는 두 용액은 특성값의 오름차순으로 출력한다.   
특성값이 0에 가장 가까운 용액을 만들어내는 경우가 두 개 이상일 경우에는 그 중 아무것이나 하나를 출력한다.

# **[ 예제 입력 #1 ]**
      5
      -2 4 -99 -1 98

# **[ 예제 출력 #1 ]**
      -99 98

# **[ 접근 순서 ]**
1. 배열을 정렬
   - 큰 수와 작은 수를 더한 결과가 0에 가까운지 확인하기 위한 단계
   
2. 두 수의 합을 변수 'mix' 에 저장
   - 계속해서 범위를 줄여가면서 mix 보다 더 작은 값이 나올 경우 mix 를 초기화 하는 방식
      - 두 수의 합이 양수인 경우 오른쪽 수가 더 크다 = 오른쪽 수를 줄인다.
      - 두 수의 합이 음수인 경우 왼쪽 수가 더 크다 = 왼쪽 수를 줄인다.
   - 두 수의 합은 절대 값으로 확인한다 (음수도 고려한 케이스)

# **[ 문제점 & 주의점 ]**

# **[ 새로 알게된 사실 ]**
1. 내가 푼 방식이 투 포인터 방식인 것 같은데... 이분 탐색의 다른 방식이기도 한가...?
   - 양쪽 인덱스를 포인터로 잡고 범위를 줄여가는 알고리즘 = 투 포인터로 보임
   
# **[ 결과 ]**
<img width="1153" alt="스크린샷 2023-05-31 오후 11 03 21" src="https://github.com/nashs789/CodeTest/assets/59809278/9e98d8c0-bcd6-4820-ab76-daba1de76549">
