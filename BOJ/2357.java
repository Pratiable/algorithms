import java.io.*;
import java.util.*;

public class Main {
    static long[] nums;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        nums = new long[n + 1];

        for (int i = 1; i < n + 1; i++) {
            nums[i] = Long.parseLong(br.readLine());
        }

        SegmentTree maxSegtree = new SegmentTree(n);
        SegmentTree minSegtree = new SegmentTree(n);
        maxSegtree.maxInit(1, 1, n);
        minSegtree.minInit(1, 1, n);

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(minSegtree.min(1, 1, n, a, b)).append(" ").append(maxSegtree.max(1, 1, n, a, b)).append("\n");
        }

        System.out.println(sb);
    }

    static class SegmentTree {
        private final long[] tree;

        SegmentTree(int n) {
            tree = new long[n * 4];
        }

        long maxInit(int node, int start, int end) {
            if (start == end) {
                return tree[node] = nums[start];
            } else {
                int mid = (start + end) / 2;
                return tree[node] = Math.max(maxInit(node * 2, start, mid), maxInit(node * 2 + 1, mid + 1, end));
            }
        }

        long minInit(int node, int start, int end) {
            if (start == end) {
                return tree[node] = nums[start];
            } else {
                int mid = (start + end) / 2;
                return tree[node] = Math.min(minInit(node * 2, start, mid), minInit(node * 2 + 1, mid + 1, end));
            }
        }

        long max(int node, int start, int end, int left, int right) {
            if (left > end || right < start) return Integer.MIN_VALUE;
            if (left <= start && end <= right) return tree[node];
            int mid = (start + end) / 2;
            return Math.max(max(node * 2, start, mid, left, right), max(node * 2 + 1, mid + 1, end, left, right));
        }

        long min(int node, int start, int end, int left, int right) {
            if (left > end || right < start) return Integer.MAX_VALUE;
            if (left <= start && end <= right) return tree[node];
            int mid = (start + end) / 2;
            return Math.min(min(node * 2, start, mid, left, right), min(node * 2 + 1, mid + 1, end, left, right));
        }
    }
}