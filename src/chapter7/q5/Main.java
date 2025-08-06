package chapter7.q5;

import org.w3c.dom.Node;

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
    public static void dfs(Node root) {
        if(root == null) return;
        else {
            // 전위
            System.out.print(root.data + " ");
            dfs(root.lt);
            dfs(root.rt);

            // 중위
            dfs(root.lt);
            System.out.print(root.data + " ");
            dfs(root.rt);

            // 후위
            dfs(root.lt);
            dfs(root.rt);
            System.out.print(root.data + " ");
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
        dfs(tree.root);
    }
}