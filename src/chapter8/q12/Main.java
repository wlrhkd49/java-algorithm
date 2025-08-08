package chapter8.q12;

import java.util.*;

public class Main {
    public static int n, m;
    public static int[][] arr;
    public static int[][] dist;
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void bfs(ArrayList<Point> points) {
        Queue<Point> queue = new LinkedList<>();
        for (Point p : points) {
            queue.add(new Point(p.x, p.y));
        }
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            for (int j = 0; j < 4; j++) {
                int nx = p.x + dx[j];
                int ny = p.y + dy[j];
                if (nx >= 0 && ny >= 0 && nx < m && ny < n
                        && arr[nx][ny] == 0) {
                    dist[nx][ny] = dist[p.x][p.y] + 1;
                    arr[nx][ny] = 1;
                    queue.add(new Point(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[m][n];
        dist = new int[m][n];
        ArrayList<Point> list = new ArrayList<>();
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                int index = kb.nextInt();
                if (index == 1) {
                    list.add(new Point(j, i));
                }
                arr[j][i] = index;
            }
        }
        bfs(list);
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    flag = false;
                }
            }
        }
        if (flag) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    answer = Math.max(answer, dist[i][j]);
                }
            }
            System.out.println(answer);
        } else System.out.println(-1);
        ;
    }
}