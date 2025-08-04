package chapter6.q2;

import java.util.Scanner;

public class Main {
    public static int[] solution(int n, int[] list) {
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(list[j] > list[j + 1]) {
                    int tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
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