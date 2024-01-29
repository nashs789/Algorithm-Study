/**
 * [ 문제 ]
 * 어떤 나라에 N개의 도시가 있다.
 * 이 도시들은 일직선 도로 위에 있다.
 * 편의상 일직선을 수평 방향으로 두자.
 * 제일 왼쪽의 도시에서 제일 오른쪽의 도시로 자동차를 이용하여 이동하려고 한다.
 * 인접한 두 도시 사이의 도로들은 서로 길이가 다를 수 있다. 도로 길이의 단위는 km를 사용한다.
 *
 * 처음 출발할 때 자동차에는 기름이 없어서 주유소에서 기름을 넣고 출발하여야 한다.
 * 기름통의 크기는 무제한이어서 얼마든지 많은 기름을 넣을 수 있다.
 * 도로를 이용하여 이동할 때 1km마다 1리터의 기름을 사용한다.
 * 각 도시에는 단 하나의 주유소가 있으며, 도시 마다 주유소의 리터당 가격은 다를 수 있다. 가격의 단위는 원을 사용한다.
 *
 * 예를 들어, 이 나라에 다음 그림처럼 4개의 도시가 있다고 하자.
 * 원 안에 있는 숫자는 그 도시에 있는 주유소의 리터당 가격이다. 도로 위에 있는 숫자는 도로의 길이를 표시한 것이다.
 *
 *              [5]---2---[2]---3---[4]---1---[1]
 *
 * 제일 왼쪽 도시에서 6리터의 기름을 넣고, 더 이상의 주유 없이 제일 오른쪽 도시까지 이동하면 총 비용은 30원이다.
 * 만약 제일 왼쪽 도시에서 2리터의 기름을 넣고(2×5 = 10원) 다음 번 도시까지 이동한 후 3리터의 기름을 넣고(3×2 = 6원)
 * 다음 도시에서 1리터의 기름을 넣어(1×4 = 4원) 제일 오른쪽 도시로 이동하면, 총 비용은 20원이다.
 * 또 다른 방법으로 제일 왼쪽 도시에서 2리터의 기름을 넣고(2×5 = 10원) 다음 번 도시까지 이동한 후 4리터의 기름을 넣고(4×2 = 8원) 제일 오른쪽 도시까지 이동하면, 총 비용은 18원이다.
 *
 * 각 도시에 있는 주유소의 기름 가격과, 각 도시를 연결하는 도로의 길이를 입력으로 받아 제일 왼쪽 도시에서 제일 오른쪽 도시로 이동하는 최소의 비용을 계산하는 프로그램을 작성하시오.
 *
 * [ 입력 ]
 * 표준 입력으로 다음 정보가 주어진다.
 * 첫 번째 줄에는 도시의 개수를 나타내는 정수 N(2 ≤ N ≤ 100,000)이 주어진다.
 * 다음 줄에는 인접한 두 도시를 연결하는 도로의 길이가 제일 왼쪽 도로부터 N-1개의 자연수로 주어진다.
 * 다음 줄에는 주유소의 리터당 가격이 제일 왼쪽 도시부터 순서대로 N개의 자연수로 주어진다.
 * 제일 왼쪽 도시부터 제일 오른쪽 도시까지의 거리는 1이상 1,000,000,000 이하의 자연수이다. 리터당 가격은 1 이상 1,000,000,000 이하의 자연수이다.
 *
 * [ 출력 ]
 * 표준 출력으로 제일 왼쪽 도시에서 제일 오른쪽 도시로 가는 최소 비용을 출력한다.
 *
 * [ 서브태스크 ]
 * 번호	배점	                제한
 * 1	17      모든 주유소의 리터당 가격은 1원이다.
 * 2	41	    2 ≤ N ≤ 1,000, 제일 왼쪽 도시부터 제일 오른쪽 도시까지의 거리는 최대 10,000, 리터 당 가격은 최대 10,000이다.
 * 3	42	    원래의 제약조건 이외에 아무 제약조건이 없다.
 *
 * [ 예제 입력 ]        [ 예제 출력 ]
 * 4                     18
 * 2 3 1
 * 5 2 4 1
 *
 * [ 예제 입력 ]        [ 예제 출력 ]
 * 4                      10
 * 3 3 4
 * 1 1 1 1
 */

package BaekJoon.Greedy.Q13305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q13305_GasStation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] km = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::new).toArray();
        long[] prices = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::new).toArray();

        int curIdx = 0;    // 현재 주유 도시
        int chargeIdx = 1; // 다음 주유 하는 도시
        long answer = 0;

        while(true){
            if(chargeIdx == N - 1){
                answer += (km[curIdx] * prices[curIdx++]);
                break;
            }

            if(prices[curIdx] > prices[chargeIdx]){
                answer += (km[curIdx] * prices[curIdx]);
                curIdx = chargeIdx++;
            } else {
                answer += prices[curIdx] * km[chargeIdx++];
            }
        }

        System.out.println(answer);
    }
}