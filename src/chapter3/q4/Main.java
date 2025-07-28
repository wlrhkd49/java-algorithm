package chapter3.q4;

import java.util.Scanner;

public class Main {
    public static int solution(int n, int m, int[] list) {
        int result = 0;
        int sum = 0;
        int lt = 0;
        for(int rt = 0; rt < n; rt++) {
            sum += list[rt];
            if(m == sum) result++;
            while(sum >= m) {
                sum -= list[lt++];
                if(sum == m) result++;
            }
        }
        /*
        int p1 = 0;
        int p2 = 0;
        int sum = list[p1];
        if(sum == m) result++;
        while(true) {
            if(sum < m) {
                ++p2;
                if(p2 >= n) break;
                sum += list[p2];
            }
            else if (sum > m) sum -= list[p1++];
            else {
                result++;
                sum -= list[p1++];
            }
        }
         */
        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = kb.nextInt();
        }
        System.out.println(solution(n, m, list));
    }
}