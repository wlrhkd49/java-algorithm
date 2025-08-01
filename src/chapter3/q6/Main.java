package chapter3.q6;

import java.util.Scanner;

public class Main {
    public static int solution(int n, int k, int[] list) {
        /*
        int result = 0;
        int max = Integer.MIN_VALUE;
        for(int lt = 0; lt < n; lt++) {
            if(n - lt < max) break;
            int cnt = 0;
            for(int rt = lt; rt < n; rt++) {
                if(list[rt] == 0) {
                    cnt++;
                }
                if(cnt == k) {
                    while(list[rt + 1] == 1) {
                        rt++;
                    }
                    result = rt - lt + 1;
                    break;
                }
            }
            max = Math.max(max, result);
        }
        return max;
         */
        int answer = 0, cnt = 0, lt = 0;
        for(int rt = 0; rt < n; rt++) {
            if(list[rt] == 0) cnt++;
            while(cnt > k) {
                if(list[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = kb.nextInt();
        }
        System.out.println(solution(n, k, list));
    }
}