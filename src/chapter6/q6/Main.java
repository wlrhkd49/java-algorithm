package chapter6.q6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void solution(int n, int[] arr) {
        int prev = Integer.MAX_VALUE;
        int[] tmp = new int[n];
        for(int i = 0; i < n; i++) {
            tmp[i] = arr[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if(tmp[i] != arr[i]) {
                System.out.print(i + 1 + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        solution(n, arr);
    }
}