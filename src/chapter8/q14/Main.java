package chapter8.q14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[][] board;
    public static Point[] combi;
    public static ArrayList<Point> hs;
    public static ArrayList<Point> pz;
    public static int answer = Integer.MAX_VALUE;

    public static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void dfs(int L, int s) {
        if(L == m) {
            int sum = 0;
            for(Point y : hs) {
                int minScore = Integer.MAX_VALUE;
                for (Point x : combi) {
                    minScore = Math.min(Math.abs(y.x - x.x) + Math.abs(y.y - x.y), minScore);
                }
                sum += minScore;
            }
            answer = Math.min(sum, answer);
        } else {
            for(int i = s; i < pz.size(); i++) {
                combi[L] = pz.get(i);
                dfs(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new Point[m];
        board = new int[n][n];
        hs = new ArrayList<>();
        pz = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int tmp = kb.nextInt();
                board[i][j] = tmp;
                if(tmp == 1) hs.add(new Point(i, j));
                if(tmp == 2) pz.add(new Point(i, j));
            }
        }
        dfs(0, 0);
        System.out.println(answer);
    }
}