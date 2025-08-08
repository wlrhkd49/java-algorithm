package chapter8.q8;

import java.util.Scanner;

// 어려움..
public class Main {
    public static int n, f;
    public static int[] b, p, ch;
    public static boolean flag = false;
    public static int[][] arr = new int[35][35];

    public static int combination(int n, int r) {
        if(arr[n][r]!=0) return arr[n][r];
        if(n==r || r==0) return 1;
        else return arr[n][r] = combination(n-1, r-1) + combination(n-1, r);
    }

    public static void dfs(int L, int sum) {
        if(flag) return;
        if(L == n) {
            if(sum == f) {
                for(int x : p) System.out.print(x + " ");
                flag = true;
            }
        } else {
            for(int i = 1; i <= n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    dfs(L + 1, sum + p[L] * b[L]);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        f = kb.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n+1];
        for(int i = 0; i < n; i++) {
            b[i] = combination(n-1, i);
        }
        dfs(0, 0);
    }
}