import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, target;
    static boolean canPut;
    static int[] weights;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int setCase = Integer.parseInt(st.nextToken());
            target = Integer.parseInt(st.nextToken());
            weights = new int[10];
            visited = new boolean[10];
            canPut = false;
            for (int j = 0; j < 10; j++) {
                weights[j] = Integer.parseInt(st.nextToken());
            }
            put(0, 0);
            sb.append(setCase).append(" ").append(canPut ? "YES" : "NO").append("\n");
        }

        System.out.println(sb);
    }

    static void put(int now, int idx) {
        if (now == target) {
            canPut = true;
            return;
        }

        for (int i = idx; i < 10; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            put(now + weights[i], i + 1);
            visited[i] = false;
        }
    }
}
