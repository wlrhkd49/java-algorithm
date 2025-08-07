package chapter8.q4;

import java.util.Scanner;

public class Main {
    public static int[] pm;
    public static int n,m;

    public static void dfs(int L) {
        if(L == n) {
            for(int i = 0; i < m; i++) {
                System.out.print(pm[i] + " ");
            }
            System.out.println();
        } else {
            for(int i = 1; i <= n; i++) {
                pm[L] = i;
                dfs(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[n];
        dfs(0);
    }
}