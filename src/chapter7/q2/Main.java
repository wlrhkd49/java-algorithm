package chapter7.q2;

import java.util.Scanner;

public class Main {
    public static void solution(int n) {
        if(n == 0) return;
        else {
            solution(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        solution(n);
    }
}