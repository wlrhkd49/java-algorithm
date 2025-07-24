package chapter1.q12;

import java.util.Scanner;

public class Main {
    public static String solution(Integer n, String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) { // 0 ~ 7, 7 ~ 15
            String tmp = str.substring(7 * i, 7 * i + 7)
                    .replace('#', '1')
                    .replace('*','0');
            char result = (char) Integer.parseInt(tmp, 2);
            builder.append(result);
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Integer n = kb.nextInt();
        String str = kb.next();
        System.out.println(solution(n, str));
    }
}