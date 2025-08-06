package chapter6.q5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static String solution(int n, int[] list) {
        Set<Integer> set = new HashSet<>();
        String result = "U";
        for(int i = 0; i < n; i++) {
            set.add(list[i]);
        }
        if(set.size() != n) {
            return "D";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = kb.nextInt();
        }
        System.out.println(solution(n, list));
    }
}