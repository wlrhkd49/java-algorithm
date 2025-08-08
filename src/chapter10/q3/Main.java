package chapter10.q3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] dy;

    public static int solution(int[] arr) {
        int answer = 0;
        dy[0] = 1;
        dy[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dy[j] > max) {
                    max = dy[j];
                }
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dy = new int[n];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(solution(arr));
    }
}