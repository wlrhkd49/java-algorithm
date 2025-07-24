package chapter1.q9;

import java.util.Scanner;

public class Main {
    public static int solution(String str) {
        /*
        StringBuilder sb = new StringBuilder();
        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                sb.append(x);
            }
        }
        System.out.println("sb.toString() = " + sb.toString());
        return Integer.parseInt(sb.toString());

         */

        int result = 0;
        for(char c : str.toCharArray()) {
            if(c >= 48 && c <= 57) {
                result = result * 10 + (c - 48);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}