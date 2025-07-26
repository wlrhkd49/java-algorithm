package chapter2.q9;

import java.util.Scanner;

public class Main {
    public static int solution(int[][] list) {
        int answer = Integer.MIN_VALUE;
        int row, col;
        for(int i = 0; i < list.length; i++) {
            row = 0;
            col = 0;
            for(int j = 0; j < list.length; j++) {
                row += list[i][j];
                col += list[j][i];
            }
            if(row > answer) answer = row;
            if(col > answer) answer = col;
        }
        row = 0;
        col = 0;
        for(int i = 0; i < list.length; i++) {
            row += list[i][i];
            col += list[i][list.length - i - 1];
        }
        if(Math.max(row, col) > answer) answer = Math.max(row, col);
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] list = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                list[i][j] = kb.nextInt();
            }
        }
        System.out.println(solution(list));
    }
}