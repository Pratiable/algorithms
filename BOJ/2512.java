import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] budgets = new int[n];
        int maxBudget = 0;

        for (int i = 0; i < n; i++) {
            budgets[i] = Integer.parseInt(st.nextToken());
            maxBudget = Math.max(maxBudget, budgets[i]);
        }

        int max = Integer.MIN_VALUE;
        int govBudget = Integer.parseInt(br.readLine());

        int start = 1;
        int end = maxBudget;

        while (start <= end) {
            int mid = (start + end) / 2;
            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += Math.min(budgets[i], mid);
            }

            if (sum > govBudget) {
                end = mid - 1;
            } else if (sum < govBudget) {
                if (max < mid) {
                    max = mid;
                }
                start = mid + 1;
            } else {
                max = mid;
                break;
            }
        }

        System.out.println(max);
    }
}