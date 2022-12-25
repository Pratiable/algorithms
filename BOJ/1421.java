import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int[] trees = new int[N];
        long max = 0;
        int maxLength = 0;

        for (int i = 0; i < N; i++) {
            int tree = Integer.parseInt(br.readLine());
            trees[i] = tree;
            if (tree > maxLength) maxLength = tree;
        }

        for (int j = 1; j < maxLength + 1; j++) {
            long sum = 0;
            for (int k = 0; k < N; k++) {
                int cutCount = 0;
                int treeCount = 0;
                int now = trees[k];
                treeCount += now / j;
                if (now % j == 0) {
                    cutCount += now / j - 1;
                } else {
                    cutCount += now / j;
                }
                if ((W * treeCount * j) - (C * cutCount) > 0) {
                    sum += ((long) W * treeCount * j) - ((long) C * cutCount);
                }
            }
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}