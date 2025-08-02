package chapter4.q2;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static String solution(String first, String second) {
        String result = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : first.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : second.toCharArray()) {
            if(!map.containsKey(c) || map.get(c) == 0) {
                result = "NO";
                return result;
            }
            map.put(c, map.get(c) - 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String first = kb.next();
        String second = kb.next();
        System.out.println(solution(first, second));
    }
}