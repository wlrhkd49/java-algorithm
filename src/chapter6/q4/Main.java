package chapter6.q4;

import java.util.*;

public class Main {
    public static int[] solution(int s, int n, int[] list) {
        /*
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            // cache miss
            if(!queue.contains(list[i])) {
                queue.addFirst(list[i]);
            }
            // cache hit
            else {
                // hit 위치
                int idx = queue.indexOf(list[i]);
                for(int j = idx; j > 0; j--) {
                    int tmp = queue.get(j-1);
                    queue.set(j-1, queue.get(j));
                    queue.set(j, tmp);
                }
            }
            if(queue.size() > s) {
                queue.removeLast();
            }
        }
        return queue;
         */
        int[] cache = new int[s];
        for(int x : list) {
            int pos = -1;
            for(int i = 0; i < cache.length; i++) {
                if(x == cache[i]) {
                    pos = i;
                }
            }
            // hit
            if(pos != -1) {
                for(int j = pos; j > 0; j--) {
                   cache[j] = cache[j - 1];
                }
            } else {
                for(int j = cache.length - 1; j > 0; j--) {
                    cache[j] = cache[j - 1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < list.length; i++) {
            list[i] = kb.nextInt();
        }
        for(int i : solution(s, n, list)) {
            System.out.print(i + " ");
        }
    }
}