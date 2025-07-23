package chapter1.q1;

import java.util.Scanner;

public class Main {
    public static int solution(String s, char a) {
        int result = 0;
        s = s.toLowerCase();
        a = Character.toLowerCase(a);
        /*
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == a) result++;
        }
         */
        for(char x : s.toCharArray()) {
            if (x == a) result++;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);
        System.out.println(solution(input1, input2));
    }
}