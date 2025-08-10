package chapter9.q8;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

// 프림 알고리즘 - PriorityQueue
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

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        int[] ch = new int[n+1];
        for(int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            graph.get(a).add(new Edge(b, c));
            // 무방향은 두개 넣어야함
            graph.get(b).add(new Edge(a, c));
        }
        int answer = 0;

        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        // 1까지 오는데 0 비용 듦 (1부터 시작)
        pQ.add(new Edge(1, 0));
        while(!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            int ev = tmp.v;
            if(ch[ev] == 0) {
                ch[ev] = 1;
                answer += tmp.cost;
                for(Edge ob : graph.get(ev)) {
                    if(ch[ob.v] == 0) pQ.offer(new Edge(ob.v, ob.cost));
                }
            }
        }
        System.out.println(answer);
    }
}