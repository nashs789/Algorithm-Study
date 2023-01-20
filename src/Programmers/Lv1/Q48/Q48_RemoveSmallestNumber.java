/**
 * [ 문제 설명 ]
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 *
 * [ 제한 조건 ]
 * - arr은 길이 1 이상인 배열입니다.
 * - 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
 *
 * [ 입출력 예 ]
 * arr	        return
 * [4,3,2,1]	[4,3,2]
 * [10]	        [-1]
 */

package Programmers.Lv1.Q48;

import java.util.Arrays;
import java.util.Comparator;

public class Q48_RemoveSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 8, 14, 26, 17, 23, 1};

        int min = arr[0];
        int answerIdx = 0;

        for(int idx = 0; idx < arr.length; idx++){
            if(min > arr[idx]){
                min = arr[idx];
            }
        }

        int cnt = 0;

        for(int idx = 0; idx < arr.length; idx++){
            if(arr[idx] == min){
                cnt++;
            }
        }

        int[] answer = new int[arr.length == 1 ? 1 : arr.length - cnt];

        for(int idx = 0; idx < arr.length; idx++){
            if(arr[idx] == min){
                continue;
            }
            answer[answerIdx++] = arr[idx];
        }

        if(answer.length == 1){
            answer[0] = -1;
        }

        Arrays.stream(answer).forEach(n -> System.out.print(n + " "));
    }
}
