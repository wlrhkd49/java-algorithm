package remember.unionfind;

import java.util.Scanner;

public class Main {
    public static int[] unf;

    public static int find(int v) {
        if(v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }

    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if(fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        unf = new int[n+1];
        for(int i = 1; i <= n; i++) unf[i] = i;
        for(int i = 1; i <= m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            union(a, b);
        }
        int x = kb.nextInt();
        int y = kb.nextInt();
        int fx = find(x);
        int fy = find(y);
        if(fx == fy) System.out.println("YES");
        else System.out.println("NO");
    }
}

/*
9 7
1 2
2 3
3 4
1 5
6 7
7 8
8 9
3 8

NO
 */