package chapter4.q5;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static int solution(int n, int k, int[] list) {
        /*
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < n - 2; i++) {
            int sum = 0;
            for(int j = i + 1; j < n - 1; j++) {
                for(int x = j + 1; x < n; x++) {
                    sum += list[i] + list[j] + list[x];
                    arrayList.add(sum);
                    sum = 0;
                }
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arrayList) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list1 = map.keySet().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        if(list1.size() < k) {
            return -1;
        }
        return list1.get(k - 1);
         */

        int result = -1;

        // TreeSet은 중복제거 및 자동정렬이 된다.
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder()); // reverseOrder 없으면 오름차순

        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int x = j + 1; x < n; x++) {
                    treeSet.add(list[i] + list[j] + list[x]);
                }
            }
        }

        int cnt = 0;
        for(int x : treeSet) {
            cnt++;
            if(cnt==k) return x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = kb.nextInt();
        }
        System.out.println(solution(n, k, list));
    }
}