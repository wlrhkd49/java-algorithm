package chapter5.q7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static String solution(String key, String str) {
        String result = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < key.length(); i++) {
            queue.offer(key.charAt(i));
        }

        for (char x : str.toCharArray()) {
            if (queue.contains(x)) {
                char c = queue.poll();
                if (c != x) return "NO";
            }
        }

        if(!queue.isEmpty()) return "NO";
        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String key = kb.next();
        String str = kb.next();
        System.out.println(solution(key, str));
    }
}