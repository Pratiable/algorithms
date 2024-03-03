import java.io.*;
import java.util.*;

public class Main {
    static int a, b, cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        cnt = 0;

        for (int i = String.valueOf(a).length(); i <= String.valueOf(b).length(); i++) {
            f(i, 0, 0);
        }

        System.out.println(cnt);
    }

    static void f(int digit, int idx, long num) {
        if (idx == digit) {
            if (num >= a && num <= b) cnt++;
            return;
        }

        f(digit, idx + 1, num * 10 + 4);
        f(digit, idx + 1, num * 10 + 7);
    }
}