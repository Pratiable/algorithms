import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[][] debt = new int[n][2];
        int[] money = new int[n];

        for (int i = 0; i < n; i++) {
            debt[i][0] = Integer.parseInt(st.nextToken());
            debt[i][1] = i;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            money[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(debt, Comparator.comparingInt(o -> o[0]));
        Arrays.sort(money);

        for (int i = 0; i < n; i++) {
            if (debt[i][0] <= money[i]) {
                debt[i][0] = money[i];
            } else {
                System.out.println(-1);
                return;
            }
        }

        Arrays.sort(debt, Comparator.comparingInt(o -> o[1]));

        for (int i = 0; i < n; i++) {
            sb.append(debt[i][0]).append(" ");
        }

        System.out.println(sb);
    }
}
