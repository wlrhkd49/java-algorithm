package backjoon.q2583;

import java.util.*;

public class Main {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int[][] graph;
    public static int sum = 0;
    public static ArrayList<Integer> answer = new ArrayList<>();
    public static int n,m;

    public static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void bfs(Point point) {
        Queue<Point> q = new LinkedList<>();
        int result = 0;
        if(graph[point.x][point.y] == 0) { result++;}
        else return;
        q.add(new Point(point.x, point.y));
        graph[point.x][point.y] = 2;
        while(!q.isEmpty()) {
            Point p = q.poll();
            for(int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m &&
                graph[nx][ny] == 0) {
                    q.offer(new Point(nx, ny));
                    graph[nx][ny] = 2;
                    result++;
                }
            }
        }
        answer.add(result);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n][m];
        int k = kb.nextInt();
        for (int i = 0; i < k; i++) {
            int x1 = kb.nextInt();
            int y1 = kb.nextInt();
            int x2 = kb.nextInt();
            int y2 = kb.nextInt();
            for (int a = y1; a < y2; a++) {
                for (int b = x1; b < x2; b++) {
                    graph[a][b] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bfs(new Point(i, j));
            }
        }
        System.out.println(answer.size());
        Collections.sort(answer);
        for(int x : answer) {
            System.out.print(x + " ");
        }

    }
}