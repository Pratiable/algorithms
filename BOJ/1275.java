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
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i < n + 1; i++) {
            nums[i] = Long.parseLong(st.nextToken());
        }

        SegmentTree segmentTree = new SegmentTree(n);
        segmentTree.init(1, 1, n);

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            long d = Long.parseLong(st.nextToken());
            if (a > b) {
                a = a ^ b;
                b = a ^ b;
                a = a ^ b;
            }

            sb.append(segmentTree.sum(1, 1, n, a, b)).append("\n");
            segmentTree.update(1, 1, n, c, d - nums[c]);
            nums[c] = d;
        }

        System.out.println(sb);
    }

    static class SegmentTree {
        private final long[] tree;

        SegmentTree(int n) {
            tree = new long[n * 4];
        }

        long init(int node, int start, int end) {
            if (start == end) return tree[node] = nums[start];
            int mid = (start + end) / 2;
            return tree[node] = init(node * 2, start, mid) + init(node * 2 + 1, mid + 1, end);
        }

        long sum(int node, int start, int end, int left, int right) {
            if (left > end || right < start) return 0;
            if (left <= start && end <= right) return tree[node];
            int mid = (start + end) / 2;
            return sum(node * 2, start, mid, left, right) + sum(node * 2 + 1, mid + 1, end, left, right);
        }

        void update(int node, int start, int end, int index, long diff) {
            if (index < start || index > end) return;
            tree[node] += diff;
            if (start == end) return;
            int mid = (start + end) / 2;
            update(node * 2, start, mid, index, diff);
            update(node * 2 + 1, mid + 1, end, index, diff);
        }
    }
}