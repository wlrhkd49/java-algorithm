package chapter1.q7;

import java.util.Scanner;

public class Main {
    public static void solution(String str) {
        char[] tmp = str.toCharArray();
        String answer = "YES";
        /*
        int lt = 0; int rt = tmp.length - 1;
        boolean flag = true;
        while (lt < rt) {
            if(Character.toLowerCase(tmp[lt]) != Character.toLowerCase(tmp[rt])) {
                flag = false;
            }
            lt++; rt--;
        }
        if(flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
         */

        /*
        str = str.toLowerCase();
        for (int i = 0; i < tmp.length / 2; i++) {
            if (str.charAt(i) != str.charAt(tmp.length - i - 1)) {
                answer = "NO";
            }
        }
        System.out.println(answer);
         */

//        str = str.toLowerCase();
        String reverseStr = new StringBuffer(str).reverse().toString();
        if(!reverseStr.equalsIgnoreCase(str)) answer = "NO";
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        solution(str);
    }
}