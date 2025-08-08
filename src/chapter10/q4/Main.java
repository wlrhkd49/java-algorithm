package chapter10.q4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static int[] dy;

    public static class Block implements Comparable<Block> {
        int bottom, h, w;
        public Block(int bottom, int h, int w) {
            this.bottom = bottom;
            this.h = h;
            this.w = w;
        }
        @Override
        public int compareTo(Block o) {
            return o.bottom - this.bottom;
        }
    }

    public static int solution(ArrayList<Block> blocks) {
        int answer = 0;
        Collections.sort(blocks);
        dy[0] = blocks.get(0).h;
        answer = dy[0];

        for(int i = 1; i < blocks.size(); i++) {
            int max = 0;
            for(int j = i - 1; j >= 0; j--) {
                if(blocks.get(i).w < blocks.get(j).w && max < dy[j]) {
                    max = dy[j];
                }
                dy[i] = blocks.get(i).h + max;
                answer = Math.max(answer, dy[i]);
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Block> blocks = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int bottom = kb.nextInt();
            int h = kb.nextInt();
            int w = kb.nextInt();
            blocks.add(new Block(bottom, h, w));
        }
        dy = new int[n];
        System.out.println(solution(blocks));
    }
}