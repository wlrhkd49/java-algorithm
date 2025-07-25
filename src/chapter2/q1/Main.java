package chapter2.q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> solution(int[] list) {
        int prev = list[0];
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(prev);
        for(int i = 1; i < list.length; i++) {
            if(prev < list[i]) {
                answer.add(list[i]);
            }
            prev = list[i];
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
        for(int x : solution(list)) {
            System.out.print(x + " ");
        }
    }
}