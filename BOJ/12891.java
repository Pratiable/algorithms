import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int[] needCounts = new int[4];
        int[] nowCounts = new int[4];
        int count = 0;

        String str = br.readLine();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            needCounts[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < p; i++) {
            char now = str.charAt(i);
            addChar(now, nowCounts);
        }

        if (isValid(needCounts, nowCounts)) count++;

        for (int i = 1; i < s - p + 1; i++) {
            char rmv = str.charAt(i - 1);
            char nxt = str.charAt(i + p - 1);
            removeChar(rmv, nowCounts);
            addChar(nxt, nowCounts);
            if (isValid(needCounts, nowCounts)) count++;
        }

        System.out.println(count);
    }

    static boolean isValid(int[] t, int[] n) {
        return t[0] <= n[0] && t[1] <= n[1] && t[2] <= n[2] && t[3] <= n[3];
    }

    private static void addChar(char c, int[] counts) {
        switch (c) {
            case 'A':
                counts[0]++;
                break;
            case 'C':
                counts[1]++;
                break;
            case 'G':
                counts[2]++;
                break;
            case 'T':
                counts[3]++;
                break;
        }
    }


    private static void removeChar(char c, int[] counts) {
        switch (c) {
            case 'A':
                counts[0]--;
                break;
            case 'C':
                counts[1]--;
                break;
            case 'G':
                counts[2]--;
                break;
            case 'T':
                counts[3]--;
                break;
        }
    }
}
