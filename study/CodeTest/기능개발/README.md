# **[ 정보 ]**
1. 소요 시간 : 21분
2. 날짜 : 2023.03.04
3. 작성자 : 유재학

# **[ 접근 방법]**
정답을 저장할 List answer, 특정 일에 배포될 기능의 수를 저장할 배열 array, 배포일에 대한 정보를 저장할 afterDay를 만든 후 1로 초기화합니다.

progresses를 처음부터 끝까지 조회하는 반복문을 만든 후 아래  조건을 만족하지 않을 때 까지 반복할 while문을 만듭니다.

    progresses[i] + speeds[i] * count < 100
해당 조건을 만족할 경우 아직 개발이 더 필요한 것으로 afterDay의 값을 1 증가시켜 줍니다. 만족하지 않는 경우 afterDay를 인덱스로 사용하여 array에 있는 값을 하나 증가시켜줍니다.

array에 저장된 값을 조회하며 0이 아닌 값이 있을 경우 answer에 추가하고, 반복문이 종료되면 answer을 배열로 변환 후 반환합니다.