package chapter1.q5;

import java.util.Scanner;

public class Main {
    public static void solution(String str) {
        char[] c = str.toCharArray();
        int lt = 0; int rt = c.length - 1;
        while (lt < rt) {
//            Character.isAlphabetic();
            if(!isAlpabetic(c[lt])) {lt++;}
            else if (!isAlpabetic(c[rt])) {rt--;}
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        System.out.println(String.valueOf(c));
    }

    public static boolean isAlpabetic(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        solution(str);
    }
}