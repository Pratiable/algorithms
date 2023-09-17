import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            items[i] = new Item(p, q);
        }

        Arrays.sort(items, (o1, o2) -> Math.abs(o2.a - o2.b) - Math.abs(o1.a - o1.b));

        long ans = 0;

        for (int i = 0; i < n; i++) {
            if (items[i].a < items[i].b) {
                if (a > 0) {
                    ans += items[i].a;
                    a--;
                } else {
                    ans += items[i].b;
                    b--;
                }
            } else {
                if (b > 0) {
                    ans += items[i].b;
                    b--;
                } else {
                    ans += items[i].a;
                    a--;
                }
            }
        }

        System.out.println(ans);
    }

    static class Item {
        public Item(int a, int b) {
            this.a = a;
            this.b = b;
        }

        int a, b;
    }
}
