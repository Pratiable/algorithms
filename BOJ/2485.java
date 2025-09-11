import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];

        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        int gap = trees[1] - trees[0];

        for (int i = 2; i < N; i++) {
            int curGap = trees[i] - trees[i - 1];
            gap = gcd(gap, curGap);
        }

        System.out.println((trees[N - 1] - trees[0]) / gap - (N - 1));
    }

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }

        return gcd(y, x % y);
    }
}
