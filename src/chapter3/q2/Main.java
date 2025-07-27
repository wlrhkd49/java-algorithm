package chapter3.q2;

import java.util.*;

public class Main {
    public static ArrayList<Integer> solution(int n, int m, ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Collections.sort(a);
        Collections.sort(b);
        int p1 = 0;
        int p2 = 0;
        while (p1 < n && p2 < m) {
            if(Objects.equals(a.get(p1), b.get(p2))) {
                answer.add(a.get(p1));
                p1++;
                p2++;
            } else if(a.get(p1) < b.get(p2)) {
                p1++;
            } else {
                p2++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            a.add(kb.nextInt());
        }
        int m = kb.nextInt();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            b.add(kb.nextInt());
        }
        for(int i : solution(n, m, a, b)) {
            System.out.print(i + " ");
        }
    }
}