package chapter7.q10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static class Node {
        int data;
        Node lt, rt;

        public Node(int val) {
            data = val;
            lt = rt = null;
        }
    }

    Node root;

    public static int bfs(int L, Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();
                if (cur.lt == null && cur.rt == null) {
                    return L;
                }
                if (cur.lt != null) {
                    queue.add(cur.lt);
                }
                if (cur.rt != null) {
                    queue.add(cur.rt);
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(bfs(0, tree.root));
    }
}