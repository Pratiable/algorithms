import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String S = br.readLine();
        int q = Integer.parseInt(br.readLine());
        int[][] count = new int[S.length()][26];

        count[0][S.charAt(0) - 'a']++;

        for (int i = 1; i < S.length(); i++) {
            int cur = S.charAt(i) - 'a';
            System.arraycopy(count[i - 1], 0, count[i], 0, 26);
            count[i][cur]++;
        }

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int alp = st.nextToken().charAt(0) - 'a';
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            sb.append(count[r][alp] - (l == 0 ? 0 : count[l - 1][alp])).append("\n");
        }

        System.out.print(sb);
    }
}
