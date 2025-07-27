package chapter2.q12;

import java.util.Scanner;

// 다시 풀어보기
public class Main {
    public static int solution(int n, int m, int[][] list) {
        int answer = 0;
        // 학생 1
        for(int i = 1; i <= n; i++) {
            // 학생 2
            for(int j = 1; j <= n; j++) {
                // 같은 학생일 경우 패스
                if(i == j) continue;
                int cnt = 0;
                // 테스트 경우 수
                for(int k = 0; k < m; k++) {
                    // 학생 수
                    int pi = 0;
                    int pj = 0;
                    for(int l = 0; l < n; l++) {
                        if(list[k][l] == i) pi = l;
                        if(list[k][l] == j) pj = l;
                    }
                    if(pi < pj) cnt++;
                    if(cnt == m) answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] list = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                list[i][j] = kb.nextInt();
            }
        }
        System.out.println(solution(n, m, list));
    }
}