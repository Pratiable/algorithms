import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        int[] dp = new int[length + 1];

        ArrayList<int[]> shortcuts = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int[] shortcut = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            shortcuts.add(shortcut);
        }

        shortcuts.sort(Comparator.comparingInt(a -> a[0]));

        for (int i = 1; i < length + 1; i++) {
            dp[i] = dp[i - 1] + 1;

            for (int[] shortcut: shortcuts) {
                if (shortcut[1] == i) {
                    dp[i] = Math.min(dp[i], dp[shortcut[0]] + shortcut[2]);
                }
            }
        }

        System.out.println(dp[length]);
    }
}
