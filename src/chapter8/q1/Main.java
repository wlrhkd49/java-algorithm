package chapter8.q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String answer = "NO";
    public static int n, total = 0;
    public static int[] arr;
    public static boolean flag;
    public static void dfs(int L, int sum) {
        if(flag) return;
        if(sum > total/2) return;
        if(L == n) {
            if(total - sum == sum) {
                flag = true;
                answer = "YES";
            }
        } else {
            dfs(L + 1, sum + arr[L]);
            dfs(L + 1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }
        dfs(0, 0);
        System.out.println(answer);
    }
}