package chapter1.q10;

import java.util.Scanner;

// 이 문제는 꼭 다시 보기
public class Main {
    public static Integer[] solution(String str, Character c) {
        Integer[] list = new Integer[str.length()];

        int p = 1000;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != c) {
                p += 1;
                list[i] = p;
            } else {
                p = 0;
                list[i] = 0;
            }
        }

        p = 1000;
        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) != c) {
                p += 1;
//                if (list[i] > p) list[i] = p;
                list[i] = Math.min(p, list[i]);
            } else {
                p = 0;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        Integer[] list = solution(str, c);
        for(int i : list) {
            System.out.print(i + " ");
        }
    }
}