package chapter6.q3;

import java.util.Scanner;

public class Main {
    public static int[] solution(int n, int[] list) {
        for (int i = 1; i < n; i++) {
            int tmp = list[i] , j;
            for(j = i - 1; j >= 0; j--) {
                if(list[j] > tmp) {
                    list[j + 1] = list[j];
                } else break;
            }
            // 삽입할 위치에 tmp값을 넣는다
            list[j + 1] = tmp;
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