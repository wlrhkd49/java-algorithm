package chapter2.q8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] solution(int[] list) {
        int[] answer = new int[list.length];
        Arrays.fill(answer, 1);
        for(int i = 0; i < list.length; i++) {
            for(int j = 0; j < list.length; j++) {
                if(i == j) continue;
                if(list[i] < list[j]) answer[i]++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = kb.nextInt();
        }
        for(int i : solution(list)) {
            System.out.print(i + " ");
        }
    }
}