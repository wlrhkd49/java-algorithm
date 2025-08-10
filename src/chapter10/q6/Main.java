package chapter10.q6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[] dy;

    public static class Problem implements Comparable<Problem> {
        int score, time;

        public Problem(int score, int time) {
            this.score = score;
            this.time = time;
        }

        @Override
        public int compareTo(Problem o) {
            return this.time - o.time;
        }
    }

    public static void solution(int n, int m, Problem[] problems) {
        Arrays.sort(problems);
        Problem firstProblem = problems[0];

        int j = 0;
        for (int i = 0; i < n; i++) {
            Problem problem = problems[i];
            int score = problem.score;
            int time = problem.time;
            // 냅색 종류가 유한개만 뒤에서 앞으로, 종류가 무한개만 앞에서 뒤로
            for (j = m; j >= time; j--) {
                if (dy[j] < dy[j - time] + score) {
                    dy[j] = dy[j - time] + score;
                }
            }
        }
        System.out.println(Arrays.stream(dy).max().getAsInt());
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        dy = new int[m + 1];
        Problem[] problems = new Problem[n];
        for (int i = 0; i < n; i++) {
            int s = kb.nextInt();
            int t = kb.nextInt();
            problems[i] = new Problem(s, t);
        }
        solution(n, m, problems);
    }
}