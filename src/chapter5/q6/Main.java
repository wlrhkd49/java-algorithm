package chapter5.q6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        int cnt = 1;
        while(queue.size() > 1){
            if(cnt % k != 0) {
                queue.offer(queue.poll());
            } else {
                queue.poll();
            }
             cnt++;
        }
        return queue.poll();
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(solution(n, k));
    }
}