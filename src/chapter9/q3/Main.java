package chapter9.q3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static class Time implements Comparable<Time> {
        int time;
        char state;
        public Time(int time, char state) {
            this.time = time;
            this.state = state;
        }
        @Override
        public int compareTo(Time o) {
            if(this.time == o.time) return this.state - o.state;
            else return this.time - o.time;
        }
    }

    public static int solution(Time[] times) {
        int answer = Integer.MIN_VALUE;
        int cnt = 0;
        Arrays.sort(times);
        for(Time t : times) {
            if(t.state == 's') cnt++;
            else if(t.state == 'e') cnt--;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Time[] times = new Time[n*2];
        for(int i = 0; i < 2*n; i+=2) {
            int start = kb.nextInt();
            int end = kb.nextInt();
            times[i] = new Time(start, 's');
            times[i+1] = new Time(end, 'e');
        }
        System.out.println(solution(times));
    }
}