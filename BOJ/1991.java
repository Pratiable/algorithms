import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Tree tree = new Tree(n + 1);
        StringTokenizer st;

        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            char parent = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            tree.data[parent - 64] = new Node(left == '.' ? 0 : left - 64, right == '.' ? 0 : right - 64);
        }

        System.out.println(tree.preorder("", 1));
        System.out.println(tree.inorder("", 1));
        System.out.println(tree.postorder("", 1));
        StringBuilder sb = new StringBuilder();

    }

    static class Tree {
        Node[] data;

        public Tree(int size) {
            this.data = new Node[size];
        }

        public String preorder(String str, int node) {
            str = str + Character.toString(node + '@');
            if (this.data[node].left != 0) {
                str = preorder(str, this.data[node].left);
            }
            if (this.data[node].right != 0) {
                str = preorder(str, this.data[node].right);
            }

            return str;
        }

        public String inorder(String str, int node) {
            if (this.data[node].left != 0) {
                str = inorder(str, this.data[node].left);
            }

            str = str + Character.toString(node + '@');

            if (this.data[node].right != 0) {
                str = inorder(str, this.data[node].right);
            }

            return str;
        }

        public String postorder(String str, int node) {
            if (this.data[node].left != 0) {
                str = postorder(str, this.data[node].left);
            }

            if (this.data[node].right != 0) {
                str = postorder(str, this.data[node].right);
            }

            return str + Character.toString(node + '@');
        }
    }

    static class Node {
        int left, right;

        public Node(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }
}