import java.io.*;
import java.util.*;

public class Main {
    static int n, k, min;
    static House[] houses, shelters;
    static boolean[] selected;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        min = Integer.MAX_VALUE;

        shelters = new House[k];
        houses = new House[n];
        selected = new boolean[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            houses[i] = new House(a, b);
        }

        f(0, 0);

        System.out.println(min);
    }

    static void f(int depth, int idx) {
        if (depth == k) {
            int max = 0;
            for (int i = 0; i < n; i++) {
                House now = houses[i];
                int near = Integer.MAX_VALUE;
                for (int j = 0; j < n; j++) {
                    if (!selected[j]) continue;
                    House sh = houses[j];
                    near = Math.min(near, Math.abs(sh.x - now.x) + Math.abs(sh.y - now.y));
                }
                max = Math.max(near, max);
            }
            min = Math.min(min, max);
            return;
        }

        for (int i = idx; i < n; i++) {
            if (selected[i]) continue;
            selected[i] = true;
            f(depth + 1, i + 1);
            selected[i] = false;
        }
    }

    static class House {
        int x, y;

        public House(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}