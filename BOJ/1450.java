import java.io.*;
import java.util.*;

public class Main {
    static int N, C;
    static long[] items;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        items = new long[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            items[i] = Long.parseLong(st.nextToken());
        }

        ArrayList<Long> first = new ArrayList<>();
        ArrayList<Long> second = new ArrayList<>();

        dfs(0, N / 2, 0, first);
        dfs(N / 2, N, 0, second);

        Collections.sort(second);

        long count = 0;

        for (long num: first) {
            count += upperBound(C - num, second);
        }

        System.out.println(count);
    }

    static void dfs(int idx, int end, long sum, ArrayList<Long> list) {
        if (sum > C) return;
        if (idx == end) {
            list.add(sum);
            return;
        }

        dfs(idx + 1, end, sum + items[idx], list);
        dfs(idx + 1, end, sum, list);
    }

    static int upperBound(long target, ArrayList<Long> list) {
        int start = 0;
        int end = list.size();

        while (start < end) {
            int mid = (start + end) / 2;

            if (list.get(mid) <= target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
