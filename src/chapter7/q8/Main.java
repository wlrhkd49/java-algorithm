package chapter7.q8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int bfs(int n, int s) {
        int L = 1;
        int[] direction = {1, -1, 5};
        int[] ch = new int[100001];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        ch[n] = 1;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int x = queue.poll();
                for (int j = 0; j < direction.length; j++) {
                    int next = x + direction[j];
                    if (next == s) {
                        return L;
                    } else if (next > 0 && next < 100001 && ch[next] == 0) {
                        ch[next] = x;
                        queue.offer(next);
                    }
                }
            }
            L++;
        }

        return L;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(bfs(s, e));
    }
}