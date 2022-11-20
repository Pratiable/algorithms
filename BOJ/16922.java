import java.io.*;
import java.util.*;

public class Main {
    public static int count;
    public static int n;
    public static boolean[] counted;
    public static int[] romanNum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        romanNum = new int[]{1, 5, 10, 50};
        counted = new boolean[1001];
        count = 0;

        make(0, 0, 0);

        System.out.println(count);
    }

    public static void make(int idx, int now, int charCount) {
        if (charCount == n) {
            if (counted[now]) return;
            counted[now] = true;
            count++;
            return;
        }

        for (int i = idx; i < 4; i++) {
            make(i, now + romanNum[i], charCount + 1);
        }
    }
}