package remember.combination;

import java.util.Scanner;

public class BasicMain {
    public static int n, m;
    public static int[] combi;

    public static void dfs(int L, int s) {
        if(L == m) {
            for(int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for(int i = s; i <= n; i++) {
                combi[L] = i;
                dfs(L+1, i+1);
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

/*
4 2

1 2
1 3
1 4
2 3
2 4
3 4
 */
