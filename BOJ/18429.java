import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static int n, k, count;
    public static boolean[] counted;
    public static int[] kits;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        counted = new boolean[n];
        kits = new int[n];
        count = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            kits[i] = Integer.parseInt(st.nextToken());
        }

        exercise(500, 0);

        System.out.println(count);
    }

    public static void exercise(int weight, int depth) {
        if (weight < 500) return;
        if (depth == n) {
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (counted[i]) continue;
            counted[i] = true;
            exercise(weight - k + kits[i], depth + 1);
            counted[i] = false;
        }
    }
}