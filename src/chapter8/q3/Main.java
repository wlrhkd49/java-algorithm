package chapter8.q3;

import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int maxScore = Integer.MIN_VALUE;
    public static class Problem {
        int score;
        int time;
        public Problem(int score, int time) {
            this.score = score;
            this.time = time;
        }
    }
    public static Problem[] arr;
    public static void dfs(int L, int sum, int time) {
        if(time > m) return;
        if(L == n) {
            maxScore = Math.max(maxScore, sum);
        } else {
            dfs(L+1, sum+arr[L].score, time+arr[L].time);
            dfs(L+1, sum, time);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new Problem[n];
        for(int i = 0; i < n; i++) {
            int score = kb.nextInt();
            int time = kb.nextInt();
            arr[i] = new Problem(score, time);
        }
        dfs(0, 0, 0);
        System.out.println(maxScore);
    }
}