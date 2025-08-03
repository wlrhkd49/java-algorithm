package chapter5.q4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static Integer solution(String str) {
        int result = 0;
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()) {
            if(c == '+' || c == '-' || c == '*' || c == '/') {
                int y = stack.pop() - '0';
                int x = stack.pop() - '0';
                if(c == '+') {
                    result = x + y;
                } else if(c == '-') {
                    result = x - y;
                } else if(c == '*') {
                    result = x * y;
                } else {
                    result = x / y;
                }
                stack.push((char) (result + '0'));
            } else {
                stack.push(c);
            }
        }
        return stack.get(0) - '0';
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}