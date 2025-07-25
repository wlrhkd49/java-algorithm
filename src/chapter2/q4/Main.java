package chapter2.q4;

import java.util.Scanner;

public class Main {
    public static int[] solution(int n) {
        int[] result = new int[n];
        result[0] = 1;
        result[1] = 1;
        for(int i = 2; i < n; i++) {
            result[i] = result[i-1] + result[i-2];
        }
        return result;
    }

    public static void solution2(int n) {
        int a=1, b=1, c;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int i : solution(n)) {
            System.out.print(i + " ");
        }
        System.out.println();
        solution2(n);
    }
}