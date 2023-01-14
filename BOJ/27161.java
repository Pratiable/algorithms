import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        boolean isReverse = false;
        int[] times = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int idxStd = 1200;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String card = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            int now = times[idxStd % 12];
            sb.append(now).append(" ");
            if (Objects.equals(card, "HOURGLASS")) {
                if (now != num) {
                    isReverse = !isReverse;
                }
                sb.append("NO\n");
            } else {
                sb.append(num == now ? "YES\n" : "NO\n");
            }
            idxStd = isReverse ? idxStd - 1 : idxStd + 1;
        }

        System.out.println(sb);
    }
}