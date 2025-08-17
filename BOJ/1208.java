import java.io.*;
import java.util.*;

public class Main {
    static int[] nums;
    static List<Integer> leftSum, rightSum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        nums = new int[N];
        leftSum = new ArrayList<>();
        rightSum = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        getSubsequence(0, N / 2, 0, leftSum);
        getSubsequence(N / 2, N, 0, rightSum);

        Collections.sort(rightSum);

        long count = 0;

        for (int i = 0; i < leftSum.size(); i++) {
            int target = S - leftSum.get(i);
            count += (upperBound(rightSum, target) - lowerBound(rightSum, target));
        }

        System.out.println(S == 0 ? count - 1 : count);
    }

    static void getSubsequence(int start, int end, int sum, List<Integer> list) {
        if (start == end) {
            list.add(sum);
            return;
        }

        getSubsequence(start + 1, end, sum, list);
        getSubsequence(start + 1, end, sum + nums[start], list);
    }

    static int lowerBound(List<Integer> list, int target) {
        int left = 0;
        int right = list.size();

        while (left < right) {
            int mid = (left + right) / 2;
            if (list.get(mid) >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }

    static int upperBound(List<Integer> list, int target) {
        int left = 0;
        int right = list.size();

        while (left < right) {
            int mid = (left + right) / 2;
            if (list.get(mid) > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }
}
