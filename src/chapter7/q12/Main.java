package chapter7.q12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 검색 개수 많을때
public class Main {
    public static ArrayList<ArrayList<Integer>> graph;
    public static int[] ch, dis;
    public static int[] bfs(int v) {
        ch[v] = 1;
        dis[v] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 0; i < len; i++) {
                int x = queue.poll();
                ch[x] = 1;
                for (int nx : graph.get(x)) {
                    if(dis[nx] == 0 && ch[nx] == 0) {
                        queue.add(nx);
                        dis[nx] = dis[x] + 1;
                    }
                }
            }
        }
        return dis;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        graph = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        ch = new int[n+1];
        dis = new int[n+1];
        for(int i = 0; i < m; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            graph.get(x).add(y);
        }
        ch[1] = 1;
        for(int i : bfs(1)) {
            System.out.print(i + " ");
        }
    }
}

/*
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5
 */