package chapter6.q7;

import java.util.*;

public class Main {
    public static class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static Point[] solution(int n, Point[] arr) {
        Arrays.sort(arr, (o1, o2) -> {
            if(o1.x != o2.x) return o1.x - o2.x;
            else return o1.y - o2.y;
        });
        return arr;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Point[] arr = new Point[n];
        for(int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr[i] = new Point(x, y);
        }
        for(Point result: solution(n, arr)) {
            System.out.println(result.x + " " + result.y);
        }
    }
}