package BaekJoon.SetAndMap.Q1302;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q1302_BestSeller {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> bookMap = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        int max = 0;
        String bestSeller = "";

        for(int idx = 0; idx < N; idx++){
            String bookName = br.readLine();
            int cnt = bookMap.getOrDefault(bookName, 0) + 1;

            if(cnt > max){
                max = cnt;
                bestSeller = bookName;
            } else if(cnt == max){
                bestSeller = bestSeller.compareTo(bookName) < 0 ? bestSeller : bookName;
            }

            bookMap.put(bookName, cnt);
        }

        System.out.println(bestSeller);
    }
}
