package chapter8.q2;

import java.util.Scanner;

public class Main {
    public static int max = Integer.MIN_VALUE;
    public static int c;

    public static void dfs(int L, int sum, int[] arr) {
        if(sum > c) return;
        if(L == arr.length) {
            max = Math.max(sum, max);
        } else {
            dfs(L+1, sum + arr[L], arr);
            dfs(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        dfs(0, 0, arr);
        System.out.println(max);
    }
}