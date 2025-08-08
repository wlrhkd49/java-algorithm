package chapter8.q13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int n;
    public static int[][] board;
    public static int[] dx = {-1, 1, 0, 0, -1, 1, 1, -1};
    public static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

    public static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void dfs(int x, int y) {
        board[x][y] = 2;
        for(int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }

    public static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));
        while(!q.isEmpty()) {
            Point p = q.poll();
            board[p.x][p.y] = 2;
            for(int i = 0; i < dx.length; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    q.offer(new Point(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int answer = 0;
        n = kb.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
//                    dfs(i, j);
                    bfs(i, j);
                }
            }
        }
        System.out.println(answer);
    }
}