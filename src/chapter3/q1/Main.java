package chapter3.q1;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> solution(int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int lt = 0;
        int rt = 0;
        while (true) {
            if (a[lt] < b[rt]) {
                answer.add(a[lt]);
                lt++;
            } else {
                answer.add(b[rt]);
                rt++;
            }
            if (lt >= a.length) {
                for (int i = rt; i < b.length; i++) {
                    answer.add(b[i]);
                }
                break;
            }
            if (rt >= b.length) {
                for (int i = lt; i < a.length; i++) {
                    answer.add(a[i]);
                }
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }

        for (int i : solution(a, b)) {
            System.out.print(i + " ");
        }
    }
}