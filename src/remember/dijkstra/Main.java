package remember.dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static class Edge implements Comparable<Edge> {
        int v, cost;
        public Edge(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    public static int n, m;
    public static ArrayList<ArrayList<Edge>> graph;
    public static int[] dis;

    public static void solution(int v) {
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.add(new Edge(v, 0));
        dis[v] = 0;
        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            int now = tmp.v;
            int nowCost = tmp.cost;
            if(dis[now] < nowCost) continue;
            for(Edge ob : graph.get(now)) {
                if(dis[ob.v] > dis[now] + ob.cost) {
                    dis[ob.v] = dis[now] + ob.cost;
                    pQ.add(new Edge(ob.v, nowCost + ob.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<>();

        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        for(int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            graph.get(a).add(new Edge(b, c));
        }
        solution(1);

        for(int i = 2; i <= n; i++) {
            if(dis[i] != Integer.MAX_VALUE) {
                System.out.println(i + " : " + dis[i]);
            }
            else {
                System.out.println(i + " : impossible");
            }
        }
    }
}

/*
6 9
1 2 12
1 3 4
2 1 2
2 3 5
2 5 5
3 4 5
4 2 2
4 5 5
6 4 5

2 : 11
3 : 4
4 : 9
5 : 14
6 : impossible
 */