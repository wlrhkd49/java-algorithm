package chapter1.q6;

import java.util.Scanner;

public class Main {
    public static void solution(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        solution(str);
    }
}