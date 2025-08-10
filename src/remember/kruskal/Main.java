package remember.kruskal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static int[] unf;

    public static class Edge implements Comparable<Edge> {
        int v1, v2, cost;
        public Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }
        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

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
        unf = new int[n + 1];
        ArrayList<Edge> arr = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            unf[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            arr.add(new Edge(a, b, c));
        }

        int cnt = 0;
        int answer = 0;
        Collections.sort(arr);
        for(Edge e : arr) {
            int v1 = e.v1, v2 = e.v2;
            // 트리가 연결되어있지 않은지 확인
            if(find(v1) != find(v2)) {
                union(v1, v2);
                answer += e.cost;
                cnt++;
            }
            if(cnt > n - 1) break;
        }
        System.out.println(answer);
    }
}