package chapter2.q3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> solution(int[] a, int[] b) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            /*
            if(a[i] == 1) {
                if(b[i] == 2) result.add("B");
                else if(b[i] == 3) result.add("A");
                else result.add("D");
            } else if (a[i] == 2) {
                if(b[i] == 2) result.add("D");
                else if(b[i] == 3) result.add("B");
                else result.add("A");
            } else {
                if(b[i] == 2) result.add("A");
                else if(b[i] == 3) result.add("D");
                else result.add("B");
            }
             */
            if (a[i] == b[i]) result.add("D");
            else if (a[i] == 1 && b[i] == 3
                    || a[i] == 2 && b[i] == 1
                    || a[i] == 3 && b[i] == 2)
                result.add("A");
            else result.add("B");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        for (int j = 0; j < n; j++) {
            b[j] = kb.nextInt();
        }
        for (String s : solution(a, b)) {
            System.out.println(s);
        }
    }
}