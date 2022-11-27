import java.io.*;
import java.util.*;

public class Main {
    static int n, max;
    static int[][] eggs;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        max = 0;
        eggs = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            eggs[i][0] = Integer.parseInt(st.nextToken());
            eggs[i][1] = Integer.parseInt(st.nextToken());
        }
        hit(0);
        System.out.println(max);
    }

    static void hit(int idx) {
        if (idx == n) {
            int cnt = 0;
            for (int l = 0; l < n; l++) {
                if (eggs[l][0] <= 0) cnt++;
            }
            max = Math.max(max, cnt);
            return;
        }

        if (eggs[idx][0] <= 0) {
            hit(idx + 1);
            return;
        }
        boolean isBreak = false;
        for (int j = 0; j < eggs.length; j++) {
            if (j == idx) continue;
            if (eggs[j][0] > 0) {
                isBreak = true;
                eggs[idx][0] -= eggs[j][1];
                eggs[j][0] -= eggs[idx][1];
                hit(idx + 1);

                eggs[idx][0] += eggs[j][1];
                eggs[j][0] += eggs[idx][1];
            }
        }
        if (!isBreak) {
            hit(idx + 1);
        }
    }
}