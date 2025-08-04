package chapter6.q1;

import java.util.Scanner;

public class Main {
    public static int[] solution(int n, int[] list) {
        for(int i = 0 ; i < n - 1; i++) {
            int idx = i;
            for(int j = i + 1; j < n; j++) {
                if (list[idx] > list[j]) {
                    idx = j;
                }
            }
            int tmp = list[i];
            list[i] = list[idx];
            list[idx] = tmp;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = kb.nextInt();
        }
        for(int i : solution(n, list)) {
            System.out.print(i + " ");
        }
    }
}