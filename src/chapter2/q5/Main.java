package chapter2.q5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int solution(int n) {
        int result = 0;
        int[] list = new int[n+1];
        list[0] = 1;
        list[1] = 1;

        for(int i = 2; i <= n; i++) {
            list[i] = 0;
        }
        /*
        for (int i = 2; i <= n; i++) {
            int mul = 2;
            int j = i;
            if(list[j] == 0) result++;
            while(j <= n) {
                if(list[j] == 0) {
                    list[j] = 1;
                }
                j = i * mul;
                mul++;
            }
        }
         */

        for (int i = 2; i <= n; i++) {
            if(list[i] == 0) {
                result++;
                for (int j = i; j <= n; j = j+i) {
                    list[j] = 1;
                }
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