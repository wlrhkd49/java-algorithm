package chapter2.q2;

import java.util.Scanner;

public class Main {
    public static int solution(int[] list) {
        int answer = 1;
        int prevMax = list[0];
        for(int i = 1; i < list.length; i++) {
            if(prevMax < list[i]) {
                answer++;
                prevMax = list[i];
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
        System.out.println(solution(list));
    }
}