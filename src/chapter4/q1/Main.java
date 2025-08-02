package chapter4.q1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static Character solution(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        Character result = null;
        for(char c : str.toCharArray()) {
//            if(!map.containsKey(c)) {
//                map.put(c, 1);
//            } else {
//                map.put(c, map.get(c) + 1);
//            }
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char key : map.keySet()) {
            int value = map.get(key);
            if(value > max) { max = value; result = key; }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(solution(str));
    }
}