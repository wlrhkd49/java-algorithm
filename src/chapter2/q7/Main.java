package chapter2.q7;

import java.util.Scanner;

public class Main {
    public static int solution(int[] list) {
        int result = 0;
        int prev = 0;
        for(int i : list) {
            if(i == 1) {
                result += prev + i;
                prev++;
            }
            else {
                prev = 0;
            }
        }
        return result;
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