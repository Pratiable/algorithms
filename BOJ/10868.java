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

        SegmentTree segmentTree = new SegmentTree(n);
        segmentTree.init(1, 1, n);

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(segmentTree.min(1, 1, n, a, b)).append("\n");
        }

        System.out.println(sb);
    }

    static class SegmentTree {
        private final long[] tree;

        SegmentTree(int n) {
            tree = new long[n * 4];
        }

        long init(int node, int start, int end) {
            if (start == end) {
                return tree[node] = nums[start];
            } else {
                int mid = (start + end) / 2;
                return tree[node] = Math.min(init(node * 2, start, mid), init(node * 2 + 1, mid + 1, end));
            }
        }

        long min(int node, int start, int end, int left, int right) {
            if (left > end || right < start) return Integer.MAX_VALUE;
            if (left <= start && end <= right) return tree[node];
            int mid = (start + end) / 2;
            return Math.min(min(node * 2, start, mid, left, right), min(node * 2 + 1, mid + 1, end, left, right));
        }
    }
}