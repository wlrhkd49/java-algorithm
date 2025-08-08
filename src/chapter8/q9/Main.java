package chapter8.q9;

import java.util.Scanner;

// 조합
// 외워버리기
public class Main {
    public static int n,m;
    public static int[] combi;

    public static void dfs(int L, int s) {
        if(L == m) {
            for(int x : combi) System.out.print(x + " ");
            System.out.println();
        } else {
            for(int i = s; i <= n; i++) {
                combi[L] = i;
                dfs(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];
        dfs(0, 1);
    }
}