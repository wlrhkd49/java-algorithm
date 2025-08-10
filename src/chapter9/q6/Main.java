package chapter9.q6;

import java.util.*;

public class Main {
    public static int[] unf;

    // Union Find
    public static int Find(int v) {
        // 외워버리기
        if(v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }
    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if(fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        unf = new int[n+1];
        for(int i = 1; i <= n; i++) unf[i] = i;
        for (int i = 1; i <= m; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            Union(x, y);
        }
        int x = kb.nextInt();
        int y = kb.nextInt();
        int fa = Find(x);
        int fb = Find(y);
        if(fa == fb) System.out.println("YES");
        else System.out.println("NO");
    }
}