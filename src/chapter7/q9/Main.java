package chapter7.q9;

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
    public static int dfs(int L, Node root) {
        // 말단 노드 체크
        if(root.lt == null && root.rt == null) {
            return L;
        } else {
            return Math.min(dfs(L+1, root.lt), dfs(L+1, root.rt));
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
        System.out.println(dfs(0, tree.root));
    }
}