import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int moved = 0;
            int now = 0;
            int cap = 0;
            Trash[] trashes = new Trash[n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                trashes[i] = new Trash(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }

            for (int i = 0; i < n; i++) {
                Trash trash = trashes[i];
                moved += trash.dist - now;
                now = trash.dist;

                if (cap + trash.cap > w) {
                    moved += now * 2;
                    cap = trash.cap;
                } else if (cap + trash.cap == w) {
                    moved += i == n - 1 ? 0 : now * 2;
                    cap = 0;
                } else {
                    cap += trash.cap;
                }
            }
            moved += now;
            sb.append(moved).append("\n");
        }
        System.out.println(sb);
    }

    static class Trash {
        int cap, dist;

        public Trash(int dist, int cap) {
            this.dist = dist;
            this.cap = cap;
        }
    }
}