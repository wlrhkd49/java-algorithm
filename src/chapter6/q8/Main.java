package chapter6.q8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int solution(int n, int m, int[] arr) {
        int result = 0;
        Arrays.sort(arr);
        int middle = arr.length / 2;
        int lt = 0, rt = arr.length - 1;
        while(lt <= rt) {
            middle = (lt + rt) / 2;
            if(arr[middle] == m) {
                return middle + 1;
            } else if(arr[middle] > m) {
                rt = middle - 1;
            } else {
                lt = middle + 1;
            }
        }
        return middle + 1;
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