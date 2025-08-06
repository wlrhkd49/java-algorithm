package chapter6.q9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean check(int capacity, int m, int[] arr) {
        int cnt = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum > capacity) {
                cnt++;
                sum = arr[i];
            }
        }
        cnt++;
        return cnt <= m;
    }

    public static int solution(int n, int m, int[] arr) {
        int result = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if(check(mid, m, arr)) {
                rt = mid - 1;
                result = mid;
            } else {
                lt = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }
}