package chapter1.q2;

import java.util.Scanner;

public class Main {
    public static String solution(String str) {
        StringBuilder strbuilder = new StringBuilder();
        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) {
                strbuilder.append(Character.toUpperCase(x));
            } else {
                strbuilder.append(Character.toLowerCase(x));
            }
        }
        return strbuilder.toString();
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}