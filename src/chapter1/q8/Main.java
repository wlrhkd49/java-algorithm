package chapter1.q8;

import java.util.Scanner;

public class Main {
    public static String solution(String str) {
        String answer = "YES";
        /*
        str = str.toLowerCase();
        char[] tmp = str.toCharArray();
        int lt = 0; int rt = tmp.length - 1;
        while (lt < rt) {
            if(!Character.isAlphabetic(tmp[lt])) lt++;
            else if (!Character.isAlphabetic(tmp[rt])) rt--;
            else {
                if(tmp[lt] != tmp[rt]) {
                    answer = "NO";
                }
                lt++; rt--;
            }
        }
         */

        str = str.toLowerCase().replaceAll("[^a-z]", "");
        String reverseStr = new StringBuffer(str).reverse().toString();
        if(!str.equalsIgnoreCase(reverseStr)) answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
    }
}