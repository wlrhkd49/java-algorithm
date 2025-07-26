package chapter2.q6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> solution(String str) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] strList = new StringBuilder(str).reverse().toString().split(" ");
        int[] list = new int[strList.length];
        for(int i = 0; i < strList.length; i++) {
            if(strList[i].isEmpty()) continue;
            list[i] = Integer.parseInt(strList[i]);
        }
        for(int i = 0; i < strList.length; i++) {
            if(isEra(list[i])) answer.add(list[i]);
        }
        return answer;
    }

    public static boolean isEra(int n) {
        int[] list = new int[100001];
        list[0] = 1;
        list[1] = 1;
        for(int i = 0; i < 100000+1; i++) {
            list[i] = 0;
        }
        for(int i = 2; i <= 100000; i++) {
            if(list[i] == 0) {
                list[i] = 1;
                if(i == n) return true;
                for(int j = i; j <= n; j = j + i) {
                    list[j] = 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String s = kb.nextLine();
        String str = kb.nextLine();
        ArrayList<Integer> answer = solution(str);
        for(int i = answer.size() - 1; i >= 0; i--) {
            System.out.print(answer.get(i) + " ");
        }
    }
}