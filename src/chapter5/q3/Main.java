package chapter5.q3;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static int solution(int n, int[][] board, int m, int[] moves) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < m; i++) {
            int move = moves[i];
            int top = 0;
            for(int j = 0; j < n; j++) {
                if(board[j][move - 1] != 0) {
                    top = board[j][move - 1];
                    board[j][move - 1] = 0;
                    break;
                }
            }
            if(top == 0) continue;
            if(!stack.isEmpty() && stack.peek() == top) {
                stack.pop();
                result += 2;
            } else {
                stack.push(top);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves = new int[m];
        for(int i = 0; i < m; i++) {
            moves[i] = kb.nextInt();
        }

        System.out.println(solution(n, board, m, moves));
    }
}