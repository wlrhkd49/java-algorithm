package chapter4.q4;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static int solution(String s, String t) {
        HashMap<Character, Integer> sm = new HashMap<>();
        HashMap<Character, Integer> tm = new HashMap<>();
        int result = 0;
        for (int i = 0; i < t.length(); i++) {
            tm.put(t.charAt(i), tm.getOrDefault(t.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length() - 1; i++) {
            sm.put(s.charAt(i), sm.getOrDefault(s.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            sm.put(s.charAt(rt), sm.getOrDefault(s.charAt(rt), 0) + 1);
            if (sm.equals(tm)) {
                result++;
            }
            sm.put(s.charAt(lt), sm.getOrDefault(s.charAt(lt), 0) - 1);
            if (sm.get(s.charAt(lt)) == 0) {
                sm.remove(s.charAt(lt));
            }
            lt++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        String t = kb.next();
        System.out.println(solution(s, t));
    }
}