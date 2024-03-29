/**
 * [ 문제 설명 ]
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
 * 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
 * 최빈값이 여러 개면 -1을 return 합니다.
 *
 * [ 제한사항 ]
 * - 0 < array의 길이 < 100
 * - 0 ≤ array의 원소 < 1000
 *
 * [ 입출력 예 ]
 * array	            result
 * [1, 2, 3, 3, 3, 4]	3
 * [1, 1, 2, 2]	        -1
 * [1]	                1
 *
 * [ 입출력 예 #1 ]
 * [1, 2, 3, 3, 3, 4]에서 1은 1개 2는 1개 3은 3개 4는 1개로 최빈값은 3입니다.
 *
 * [ 입출력 예 #2 ]
 * [1, 1, 2, 2]에서 1은 2개 2는 2개로 최빈값이 1, 2입니다. 최빈값이 여러 개이므로 -1을 return 합니다.
 *
 * [ 입출력 예 #3 ]
 * [1]에는 1만 있으므로 최빈값은 1입니다.
 */

package Programmers.Lv0.Q13;

public class Q13_MostOftenValue {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 3, 3, 4};
        int[] cntArray = new int[1000];
        int max = 0;
        int maxCnt = 0;
        int answer = 0;

        for(int idx = 0; idx < array.length; idx++){
            int value = array[idx];

            cntArray[value] += 1;
            if(max < cntArray[value]){
                max = cntArray[value];
            }
        }

        for(int idx = 0; idx < cntArray.length; idx++){
            if(max == cntArray[idx]){
                maxCnt++;
                answer = idx;
            }
        }

        System.out.println(    maxCnt > 1 ? -1 : answer    );
    }
}