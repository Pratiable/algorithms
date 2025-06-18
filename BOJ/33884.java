import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Node[] f = new Node[n];
        Node[] s = new Node[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            f[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            s[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        sort(f);
        sort(s);

        System.out.printf("%d %d", s[0].x - f[0].x, s[0].y - f[0].y);
    }

    private static void sort(Node[] arr) {
        Arrays.sort(arr, (o1, o2) -> {
            if (o1.x < o2.x) {
                return 1;
            } else if (o1.x == o2.x) {
                return o1.y < o2.y ? 1 : -1;
            } else {
                return -1;
            }
        });
    }

    static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
