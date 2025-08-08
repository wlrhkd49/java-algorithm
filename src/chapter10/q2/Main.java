package chapter10.q2;

import java.util.Scanner;

public class Main {
    public static int[] dy;
    public static int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for(int i = 3; i <= n+1; i++) {
            dy[i] = dy[i-1] + dy[i-2];
        }
        return dy[n+1];
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dy = new int[n + 2];
        System.out.println(solution(n));
    }
}