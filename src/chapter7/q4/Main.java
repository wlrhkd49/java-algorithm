package chapter7.q4;

import java.util.Scanner;

public class Main {
    static int[] fibo;
    public static int solution(int n) {
        if(fibo[n] != 0) return fibo[n];
        if(n == 1) return fibo[n] = 1;
        else if (n==2) return fibo[n] = 1;
        else return fibo[n] = solution(n-2) + solution(n-1);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        fibo = new int[n+1];
        solution(n);
        for(int i = 1; i < fibo.length; i++){
            System.out.print(fibo[i] + " ");
        }
    }
}