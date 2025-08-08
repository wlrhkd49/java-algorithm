package chapter9.q2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static class Time implements Comparable<Time> {
        int start, end;
        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Time o) {
            if(this.end != o.end) return this.end - o.end;
            else return this.start - o.start;
        }
    }

    public static int solution(Time[] times) {
        int answer = 0;
        Arrays.sort(times);
        int endTime = 0;
        for (Time time : times) {
            if (time.start >= endTime) {
                endTime = time.end;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Time[] times = new Time[n];
        for(int i = 0; i < n; i++) {
            int start = kb.nextInt();
            int end = kb.nextInt();
            times[i] = new Time(start, end);
        }
        System.out.println(solution(times));
    }
}