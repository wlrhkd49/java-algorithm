package chapter10.q5;

import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[] dy;
    public static int[] arr;

    public static int solution(int[] arr) {
        int answer = 0;
        dy[0] = 0;
        dy[arr[0]] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m; j++) {
                if (dy[j] > dy[j - arr[i]] + 1) {
                    dy[j] = dy[j - arr[i]] + 1;
                }
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        m = kb.nextInt();
        dy = new int[m + 1];
        for (int i = 0; i <= m; i++) {
            dy[i] = Integer.MAX_VALUE;
        }

        System.out.println(solution(arr));
    }
}