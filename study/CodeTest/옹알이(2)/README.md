# **[ 정보 ]**
1. 소요 시간 : 32분
2. 날짜 : 2023.01.14
3. 작성자 : 유재학

# **[ 접근 방법]**
발음 가능한 문자열을 저장한 배열을 만든 후 입력 받는 babbling 배열과 함께 for 문으로 조회하여 아래 조건을 기준으로 변경하여 정답을 구했습니다.

 1. 이때 동일한 문자열이 연속으로 나오는 경우 발음할 수 없기 때문에 if문을 통해 다음 으로 넘겨줍니다.
 2. 해당 문자가 포함되어 있을 경우 그 문자를 공백으로 변경시켜 줍니다.
3. 해당 문자의 공백을 지웠을 때 길이가 0이면 answer를 1추가하고, 다음 문자로 넘어갑니다.


# **[ 실패했던 내용]**
1. 같은 발음이 연속으로 나올 경우 발음하지 못한다는 조건을 늦게 확인하여 실패