package chapter2.q10;

import java.util.Scanner;

public class Main {
    public static int[] dx = { 0, 1, 0, -1 };
    public static int[] dy = { 1, 0, -1, 0 };

    public static int solution(int[][] list) {
        int answer = 0;
        for(int i = 1; i < list.length-1; i++) {
            for(int j = 1; j < list[i].length-1; j++) {
                boolean flag = true;
                for (int x = 0; x < 4; x++) {
                    int around = list[i + dx[x]][j + dy[x]];
                    if(around >= list[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] list = new int[n+2][n+2];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                list[i+1][j+1] = kb.nextInt();
            }
        }
        System.out.print(solution(list));
    }
}