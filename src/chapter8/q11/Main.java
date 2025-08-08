package chapter8.q11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int n = 7;
    public static int[][] graph = new int[n][n];
    public static int[][] dist = new int[n][n];
    public static int answer = 1;
    public static int min = 0;

    public static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        graph[x][y] = 1;
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && graph[nx][ny] == 0) {
                    graph[nx][ny] = 1;
                    dist[nx][ny] = dist[p.x][p.y] + 1;
                    queue.offer(new Point(nx, ny));
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = kb.nextInt();
            }
        }
        bfs(0, 0);
        if (dist[n - 1][n - 1] == 0) System.out.println(-1);
        else System.out.println(dist[n - 1][n - 1]);
    }
}