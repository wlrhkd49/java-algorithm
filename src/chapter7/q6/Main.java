package chapter7.q6;

import java.util.Scanner;

public class Main {
    static int n;
    static int[] ch;

    public static void dfs(int L) {
        if(L == n + 1) {
            for(int i = 1; i < ch.length; i++) {
                if(ch[i] == 1) System.out.print(i + " ");
            }
            System.out.println();
        } else {
            ch[L] = 1; // 원소 사용
            dfs(L + 1);
            ch[L] = 0; // 원소 사용 x
            dfs(L + 1);
        }
    }

    public static void main(String[] args) {
        n = 3;
        ch = new int[n+1];
        dfs(1);
    }
}