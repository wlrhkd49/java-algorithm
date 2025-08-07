package chapter7.q11;

import java.util.Scanner;

// 검색 개수 적을때
public class Main {
    public static int answer = 0;
    public static int[][] graph;
    public static int[] ch;
    public static void dfs(int v) {
        if(v == 5) {
            answer++;
        } else {
            for(int i = 1; i < graph.length; i++) {
                if(graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    dfs(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for(int i = 0; i < m; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            graph[x][y] = 1;
        }
        ch[1] = 1;
        dfs(1);
        System.out.println(answer);
    }
}

/*
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5
 */