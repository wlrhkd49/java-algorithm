package chapter8.q10;

import java.util.Scanner;

public class Main {
    public static int[] dx = {-1 , 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int n = 7;
    public static int[][] graph = new int[n][n];
    public static int answer = 0;

    public static void dfs(int x, int y) {
        if(x == n-1 && y == n-1) {
            answer++;
        } else {
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < n
                        && graph[nx][ny] == 0) {
                    graph[nx][ny] = 1;
                    dfs(nx, ny);
                    graph[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                graph[i][j] = kb.nextInt();
            }
        }
        graph[0][0] = 1;
        dfs(0, 0);
        System.out.println(answer);
    }
}