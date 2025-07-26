package chapter2.q11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int solution(int n, int[][] list) {
        int result = 0;
        int max = 0;
        // 학생 번호를 저장하는 임시 변수
        for(int i = 0; i < n; i++) {
            ArrayList<Integer> students = new ArrayList<>();
            for(int j = 0; j < 5; j++) {
                int me = list[i][j];
                for(int k = 0; k < n; k++) {
                    if(j == k) continue;
                    int other = list[k][j];
                    if(me == other) {
                        if(!students.contains(k)) students.add(k);
                    }
                }
            }
            if(max < students.size()) {
                max = students.size();
                result = i + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] list = new int[n][5];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 5; j++) {
                list[i][j] = kb.nextInt();
            }
        }
        System.out.println(solution(n, list));
    }
}