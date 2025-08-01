package chapter3.q5;

import java.util.Scanner;

public class Main {
    public static int solution(int n) {
        /*
        int result = 0;
        int sum = 0;
        int num = 1;
        int p1 = 1;
        while(true) {
            if(sum == n) {
                result++;
                sum = sum - p1++;
            } else if (sum > n) {
                sum = sum - p1++;
            } else {
                sum += num++;
            }

            if(num > (n/2 + 1)) break;
        }
        return result;
         */
        int result = 0, sum = 0, lt = 0;
        int m = n/2 + 1;
        int[] list = new int[m];
        for(int i = 0; i < m; i++) {
            list[i] = i+1;
        }
        for(int rt = 0; rt < m; rt++) {
            sum += list[rt];
            if(sum == n) result++;
            while(sum >= n) {
                sum -= list[lt++];
                if(sum == n) result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(solution(n));
    }
}