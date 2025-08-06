package chapter6.q10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static int solution(int n, int m, int[] arr) {
        int result = 0;
        Arrays.sort(arr);
        int lt = arr[1] - arr[0], rt = arr[n - 1];
        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if(count(mid, arr) < m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
                result = mid;
            }
        }

        return result;
    }

    private static int count(int capacity, int[] arr) {
        int cnt = 1;
        int point = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] - point >= capacity) {
                cnt++;
                point = arr[i];
            }
        }
        return cnt;
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