package chapter9.q6.my;

import java.util.*;

public class Main {
    public static int n, m;
    public static int graph[][];

    public static String solution(int x, int y) {
        String answer = "NO";
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            map.put(graph[i][0], graph[i][1]);
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(map.get(x));
        int cnt = 0;
        while (!q.isEmpty()) {
            int next = q.poll();
            if (next == y) {
                return "YES";
            }
            else {
                if (map.containsKey(next)) {
                    q.offer(next);
                }
            }
            cnt++;
            if(cnt > m) break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[m][2];
        for (int i = 0; i < m; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            graph[i][0] = x;
            graph[i][1] = y;
        }
        int x = kb.nextInt();
        int y = kb.nextInt();
        System.out.println(solution(x, y));
    }
}