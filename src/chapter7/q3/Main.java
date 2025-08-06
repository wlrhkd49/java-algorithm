package chapter7.q3;

import java.util.Scanner;

public class Main {
    public static int solution(int n) {
        if(n == 1) return 1;
        else {
            return n * solution(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(solution(n));
    }
}