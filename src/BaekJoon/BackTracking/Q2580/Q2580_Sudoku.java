package BaekJoon.BackTracking.Q2580;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q2580_Sudoku {

    public static int[][] sudoku;
    // visited 는 방문 보다는 숫자가 있음 유무
    public static boolean[][] visitedRow;
    public static boolean[][] visitedCol;
    public static boolean[][] visitedArea;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sudoku = new int[9][9];
        visitedRow = new boolean[9][9];
        visitedCol = new boolean[9][9];
        visitedArea = new boolean[9][9];

        for(int i = 0; i < 9; i++){
            int[] row = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for(int j = 0; j < 9; j++){
                sudoku[i][j] = row[j];

                if(row[j] != 0){
                    visitedRow[i][row[j] - 1] = true;
                    visitedCol[j][row[j] - 1] = true;
                    visitedArea[(i / 3) * 3 + (j / 3)][row[j] - 1] = true;
                }
            }
        }
        backTracking(0);
    }

    static void backTracking(int x){
        for(int i = x; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(sudoku[i][j] == 0){
                    Iterator<Integer> it = getPossibilities(i, j).iterator();

                    while(it.hasNext()){
                        int num = it.next() - 1;

                        if(isOk(i, j, num)){
                            sudoku[i][j] = num + 1;
                            visitedRow[i][num] = true;
                            visitedCol[j][num] = true;
                            visitedArea[getSquareIdx(i, j)][num] = true;
                            backTracking(i);
                            sudoku[i][j] = 0;
                            visitedRow[i][num] = false;
                            visitedCol[j][num] = false;
                            visitedArea[getSquareIdx(i, j)][num] = false;
                        }
                    } // while end
                    return;
                }
            }
        }

        for(int a[] : sudoku){
            for(int b : a){
                sb.append(b).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
        System.exit(0);
    }

    static Set<Integer> getPossibilities(int x, int y){
        Set<Integer> set = new HashSet<>();

        for(int idx = 0; idx < 9; idx++){
            int num = idx + 1;

            if(!visitedRow[x][idx]){
                set.add(num);
            }

            if(visitedCol[y][idx]){
                set.remove(num);
            }

            if(visitedArea[getSquareIdx(x, y)][idx]){
                set.remove(num);
            }
        }

        return set;
    }

    static boolean isOk(int x, int y, int num){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++) {
                if (visitedRow[x][num] || visitedCol[y][num] || visitedArea[getSquareIdx(x, y)][num]) {
                    return false;
                }
            }
        }
        return true;
    }

    static int getSquareIdx(int x, int y){
        return (x / 3) * 3 + (y / 3);
    }

}

/*
ex 1)
5 8 3 2 1 9 6 4 0
4 0 2 0 5 6 9 8 1
1 9 6 0 8 4 0 0 5
8 3 4 6 7 2 1 5 9
0 1 5 8 9 3 4 0 0
0 2 9 1 4 5 8 0 0
2 6 8 9 3 7 5 1 4
3 5 7 4 6 1 2 9 8
9 4 1 5 2 8 0 6 0

ans1)
5 8 3 2 1 9 6 4 7
4 7 2 3 5 6 9 8 1
1 9 6 7 8 4 3 2 5
8 3 4 6 7 2 1 5 9
6 1 5 8 9 3 4 7 2
7 2 9 1 4 5 8 3 6
2 6 8 9 3 7 5 1 4
3 5 7 4 6 1 2 9 8
9 4 1 5 2 8 7 6 3

0 0 0 0 0 0 0 0 9
0 0 0 0 0 0 0 0 8
0 0 0 0 0 0 0 0 7
0 0 0 0 0 0 0 0 6
0 0 0 0 0 0 0 0 5
0 0 0 0 0 0 0 0 4
0 0 0 0 0 0 0 0 3
0 0 0 0 0 0 0 0 2
0 0 0 0 0 0 0 0 1

0 0 0 1 2 0 0 0 0
0 1 0 0 0 0 0 0 0
0 0 0 7 0 0 0 0 1
0 2 0 0 0 0 0 0 5
0 0 0 0 0 0 3 0 0
1 0 0 0 0 0 0 0 0
3 7 0 0 0 4 0 0 0
0 0 0 0 0 0 0 0 9
0 0 0 0 0 0 0 0 0

0 0 0 1 2 0 0 0 0
0 1 0 0 0 0 0 0 0
0 0 0 7 0 0 0 0 1
0 2 0 0 0 0 0 0 5
0 0 0 0 0 0 3 0 0
1 0 0 0 0 0 0 0 0
3 7 0 0 0 4 0 0 0
0 0 0 0 0 0 0 0 9
9 0 0 0 0 0 0 0 2
 */