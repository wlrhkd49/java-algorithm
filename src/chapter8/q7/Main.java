
package chapter8.q7;

import java.util.Scanner;

public class Main {
    public static int[][] arr;
    public static int solution(int n, int r) {
        if(arr[n][r] != 0) return arr[n][r];
        if(n == r || r==0) {
            arr[n][r] = 1;
            return 1;
        }
        else {
            arr[n][r] = solution(n-1, r-1) + solution(n-1, r);
            return arr[n][r];
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        arr = new int[n + 1][r + 1];
        System.out.println(solution(n, r));
    }
}