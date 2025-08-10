package chapter9.q4;

import java.util.*;

public class Main {
    public static class Lecture implements Comparable<Lecture> {
        int money, time;
        public Lecture(int money, int time) {
            this.money = money;
            this.time = time;
        }

        @Override
        public int compareTo(Lecture o) {
            return o.time - this.time;
        }
    }

    public static int n, max = Integer.MIN_VALUE;

    public static int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j = 0;
        for(int i = max; i >= 1; i--) {
            for( ; j < n; j++) {
                if(arr.get(j).time < i) break;
                pQ.offer(arr.get(j).money);
            }
            if(!pQ.isEmpty()) {
                answer += pQ.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int m = kb.nextInt();
            int t = kb.nextInt();
            arr.add(new Lecture(m, t));
            if(t > max) max = t;
        }
        System.out.println(solution(arr));
    }
}