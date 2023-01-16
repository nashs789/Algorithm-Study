/**
 * [ 문제 설명 ]
 * 수포자는 수학을 포기한 사람의 준말입니다.
 * 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
 * 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 *
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 *
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 * [ 제한 조건 ]
 * - 시험은 최대 10,000 문제로 구성되어있습니다.
 * - 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
 * - 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
 *
 * [ 입출력 예 ]
 * answers	    return
 * [1,2,3,4,5]	[1]
 * [1,3,2,4,2]	[1,2,3]
 *
 * [ 입출력 예 #1 ]
 * 수포자 1은 모든 문제를 맞혔습니다.
 * 수포자 2는 모든 문제를 틀렸습니다.
 * 수포자 3은 모든 문제를 틀렸습니다.
 * 따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.
 *
 * [ 입출력 예 #2 ]
 * 모든 사람이 2문제씩을 맞췄습니다.
 */

package Programmers.Lv1.Q31;

import java.util.ArrayList;
import java.util.List;

public class Q31_MockTest {
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};
        
        int[] hitScore = new int[3];
        int[] first = {1, 2, 3, 4, 5};
        int firstIdx = 0;
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int secondIdx = 0;
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int thirdIdx = 0;

        for(int idx = 0; idx < answers.length; idx++){
            if(first.length == firstIdx){
                firstIdx = 0;
            }

            if(first[firstIdx++] == answers[idx]){
                hitScore[0] += 1;
            }

            if(second.length == secondIdx){
                secondIdx = 0;
            }

            if(second[secondIdx++] == answers[idx]){
                hitScore[1] += 1;
            }

            if(third.length == thirdIdx){
                thirdIdx = 0;
            }

            if(third[thirdIdx++] == answers[idx]){
                hitScore[2] += 1;
            }
        }
        
        int max = getMax(hitScore);
        int[] returnArr = getReturnList(hitScore, max);
    }

    private static int[] getReturnList(int[] hitScore, int max) {
        List<Integer> list = new ArrayList<>();

        for(int idx = 0; idx < hitScore.length; idx++){
            if(max == hitScore[idx]){
                list.add(idx + 1);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    private static int getMax(int[] hitScore) {
        int max = 0;
        
        for(int idx = 0; idx < hitScore.length; idx++){
            if(hitScore[idx] > max){
                max = hitScore[idx]; 
            }
        }
        
        return max;
    }
}

// 00:11 - 00:40
