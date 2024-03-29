# **[ 정보 ]**
1. 소요 시간: 4시간 43분
2. 날짜: 2023.02.13(월)
3. 저자: 이 인복
4. 문제: 124 나라의 숫자

# **[ 문제 설명 ]**
124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.   
124 나라에는 자연수만 존재합니다.   
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.   
예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.

<img width="321" alt="스크린샷 2023-02-14 오전 1 21 54" src="https://user-images.githubusercontent.com/59809278/218514639-7075fa9a-1ff4-456b-b77f-825da2759041.png">

자연수 n이 매개변수로 주어질 때,   
n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.

# **[ 제한사항 ]**
- n은 50,000,000이하의 자연수 입니다.

# **[ 입출력 예 ]**
    n	result
    1	1
    2	2
    3	4
    4	11

# **[ 접근 순서 ]**
- 현타온다.......

- 3진법과 동일한 방법이지만 3으로 나누었을 때 0이라면 3대신 4가 들어가는 것 (규칙성은 있으나 코드로 구현하는데 많이 애먹음)

- 다른 사람 풀이 보고 현타 x2 ===> 조금 더 생각해볼 여지는 있음 ===> 다시 보고 공부할것...(괴롭다)

# **[ 문제점 & 주의점 ]**
- 잦은 문자열 때문에 시간이 초과되지 않았나 싶음


            [ 시간초과 코드 ]
            public static void main(String[] args) {
                int n = 23;
                String answer = "";
                boolean flag = false;
            
                while(n >= 1){
                    int rest = n % 3 == 0 ? 4 : n % 3;
        
                    if(flag){
                        answer = (rest == 4 ? 2 : rest == 2 ? 1 : 0) + answer;
                    } else {
                        answer = rest + answer;
                    }
        
                    if(rest == 4){
                        flag = true;
                    } else {
                        flag = false;
                    }
        
                    if(answer.substring(0, 1).equals("0") && n / 3 >= 1){
                        answer = "4" + answer.substring(1);
                        flag = true;
                    }
        
                    n /= 3;
                }
        
                System.out.println(answer.replace("0", ""));
            }

# **[ 새로 알게된 사실 ]**

# **[ 결과 ]**
<img width="371" alt="스크린샷 2023-02-14 오전 1 25 22" src="https://user-images.githubusercontent.com/59809278/218514655-fc640af9-24d2-49bc-a520-0a78b2b4342b.png">

