package chapter4.q3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> solution(int n, int k, int[] list) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < k - 1; i++) {
            map.put(list[i], map.getOrDefault(list[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            map.put(list[rt], map.getOrDefault(list[rt], 0) + 1);
            result.add(map.size());
            map.put(list[lt], map.getOrDefault(list[lt], 0) - 1);
            if (map.get(list[lt]) == 0) {
                map.remove(list[lt]);
            }
            lt++;
        }

        /*
        while (p2 < n) {
            // k 길이만큼 넣음
            if (p2 - p1 < k) {
                map.put(list[p2], map.getOrDefault(list[p2], 0) + 1);
                p2++;
            }
            if (p2 - p1 == k) {
                result.add(map.size());
                map.put(list[p1], map.getOrDefault(list[p1], 0) - 1);
                if (map.get(list[p1]) == 0) {
                    map.remove(list[p1]);
                }
                p1++;
            }
        }
         */

        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = kb.nextInt();
        }
        for (int i : solution(n, k, list)) {
            System.out.print(i + " ");
        }
    }
}