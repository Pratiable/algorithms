import java.io.*;
import java.util.*;

public class Main {
    static long[] nums;
    static int MOD = 1_000_000_007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        nums = new long[n + 1];

        for (int i = 1; i < n + 1; i++) {
            nums[i] = Long.parseLong(br.readLine());
        }

        SegmentTree segmentTree = new SegmentTree(n);
        segmentTree.init(1, 1, n);

        for (int i = 0; i < m + k; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            if (a == 1) {
                segmentTree.update(1, 1, n, b, c);
                nums[b] = c;
            } else {
                sb.append(segmentTree.mul(1, 1, n, b, Math.toIntExact(c)) % MOD).append("\n");
            }
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
                return tree[node] = nums[start] % MOD;
            } else {
                int mid = (start + end) / 2;
                return tree[node] = (init(node * 2, start, mid) * init(node * 2 + 1, mid + 1, end)) % MOD;
            }
        }

        long mul(int node, int start, int end, int left, int right) {
            if (left > end || right < start) return 1;
            if (left <= start && end <= right) return tree[node] % MOD;
            int mid = (start + end) / 2;
            return ((mul(node * 2, start, mid, left, right) % MOD) * (mul(node * 2 + 1, mid + 1, end, left, right) % MOD)) % MOD;
        }

        void update(int node, int start, int end, int index, long val) {
            if (index < start || index > end) return;
            if (start == end) {
                tree[node] = val % MOD;
            } else {
                int mid = (start + end) / 2;
                update(node * 2, start, mid, index, val);
                update(node * 2 + 1, mid + 1, end, index, val);
                tree[node] = (tree[node * 2] * tree[node * 2 + 1]) % MOD;
            }
        }
    }
}