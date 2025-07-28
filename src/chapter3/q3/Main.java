package chapter3.q3;

import java.util.Scanner;

public class Main {
    public static int solution(int k, int[] list) {
        // sliding window
        int result, sum = 0;
        for(int i = 0; i < k; i++) sum += list[i];
        result = sum;
        for(int i = k; i < list.length; i++) {
            sum += list[i] - list[i - k];
            result = Math.max(result, sum);
        }
        /*
        int p1 = 0;
        int p2 = p1 + k - 1;
        int result = 0;
        for(int i = p1; i <= p2; i++) {
            result += list[i];
        }
        int prev = result;
        while (true) {
            p2++;
            if(p2 >= list.length) { break; }
            prev = prev - list[p1++] + list[p2];
            result = Math.max(result, prev);
        }
         */
        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = kb.nextInt();
        }
        System.out.println(solution(k, list));
    }
}