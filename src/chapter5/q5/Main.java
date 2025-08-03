package chapter5.q5;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int solution(String str) {
        Stack<Character> stack = new Stack<>();
        int result = 0;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {
                stack.pop();
                if (str.charAt(i-1) == ')') {
                    result++;
                } else {
                    result += stack.size();
                }
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