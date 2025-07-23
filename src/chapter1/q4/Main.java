package chapter1.q4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> solution(int n, String[] str) {
        /* StringBuilder 활용
        ArrayList<String> answer = new ArrayList<>();
        for (String s: str) {
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }
        return answer;
         */

        ArrayList<String> answer = new ArrayList<>();
        for (String s: str) {
            char[] x = s.toCharArray();
            int lt = 0;
            int rt = x.length - 1;
            while(lt < rt) {
                char tmp = x[rt];
                x[rt] = x[lt];
                x[lt] = tmp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(x));
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i = 0 ; i < n ; i++) {
            str[i] = kb.next();
        }
        for (String x : solution(n, str)) {
            System.out.println(x);
        }
    }
}