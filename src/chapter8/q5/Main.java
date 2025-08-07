package chapter8.q5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static int n;
    public static Integer[] arr;
    public static int target;
    public static int min = Integer.MAX_VALUE;

    public static void dfs(int L, int sum, int cnt) {
        if (min < cnt) return;
        if (target < sum) return;
        if (sum == target) min = Math.min(min, cnt);
        else {
            for (int i = 0; i < n; i++) {
                dfs(L + 1, sum + arr[i], cnt + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        target = kb.nextInt();
        dfs(0, 0, 0);
        System.out.println(min);
    }
}