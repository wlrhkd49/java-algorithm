package chapter8.q6;

import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[] arr;
    public static int[] check;
    public static int[] pm;
    public static void dfs(int L) {
        if(L == m) {
            for(int i : pm) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for(int i = 0; i < n; i++) {
                if(check[i] == 0) {
                    check[i] = 1;
                    pm[L] = arr[i];
                    dfs(L + 1);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n];
        pm = new int[m];
        check = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        dfs(0);
    }
}