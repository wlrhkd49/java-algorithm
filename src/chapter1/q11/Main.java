package chapter1.q11;

import java.util.Scanner;

public class Main {
    public static String solution(String str) {
        StringBuilder builder = new StringBuilder();
        char x = str.charAt(0);
        int num = 1;
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == x) {
                num++;
            } else {
                builder.append(x);
                x = str.charAt(i);
                if(num != 1) {
                    builder.append(num);
                    num = 1;
                }
            }
        }
        builder.append(x);
        if(num != 1) { builder.append(num); }

        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(solution(str));
    }
}