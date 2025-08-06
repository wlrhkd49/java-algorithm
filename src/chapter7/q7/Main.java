package chapter7.q7;

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
    public static void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(L + " : ");
            for(int i = 0; i < len; i++) {
                Node node = queue.poll();
                System.out.print(node.data + " ");
                if(node.lt != null) { queue.offer(node.lt); }
                if(node.rt != null) { queue.offer(node.rt); }
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        bfs(tree.root);
    }
}