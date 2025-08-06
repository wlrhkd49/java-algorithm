package chapter7.q1;

import java.util.Scanner;

public class Main {
    public static void dfs(int n) {
        if(n == 0) return;
        else {
            dfs(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dfs(n);
    }
}