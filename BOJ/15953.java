import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] aRank = new int[]{1, 3, 6, 10, 15, 21, 100};
        int[] aPrize = new int[]{5000000, 3000000, 2000000, 500000, 300000, 100000, 0};
        int[] bRank = new int[]{1, 3, 7, 15, 31, 64};
        int[] bPrize = new int[]{5120000, 2560000, 1280000, 640000, 320000, 0};
        for (int i = 0; i < n; i++) {
            int totalPrize = 0;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for (int j = 0; j < aRank.length; j++) {
                if (a == 0) break;
                if (a <= aRank[j]) {
                    totalPrize += aPrize[j];
                    break;
                }
            }

            for (int k = 0; k < bRank.length; k++) {
                if (b == 0) break;
                if (b <= bRank[k]) {
                    totalPrize += bPrize[k];
                    break;
                }
            }

            sb.append(totalPrize).append("\n");
        }
        System.out.println(sb);
    }
}