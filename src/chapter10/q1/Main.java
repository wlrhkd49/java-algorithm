package chapter10.q1;

import java.util.Scanner;

public class Main {
    public static int[] dp;

    public static int solution(int n) {
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dp = new int[n + 1];
        System.out.println(solution(n));
    }
}