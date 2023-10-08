import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        boolean[] buttons = new boolean[10];
        Arrays.fill(buttons, true);

        if (m > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < m; i++) {
                buttons[Integer.parseInt(st.nextToken())] = false;
            }
        }

        if (n == 100) {
            System.out.println(0);
            return;
        }

        int min = Math.abs(n - 100);

        for (int i = n; i <= 1000000; i++) {
            if (check(i, buttons)) {
                min = Math.min(min, (i != 0 ? (int) (Math.log10(i) + 1) : 1) + Math.abs(i - n));
                break;
            }
        }

        for (int i = n; i >= 0; i--) {
            if (check(i, buttons)) {
                min = Math.min(min, (i != 0 ? (int) (Math.log10(i) + 1) : 1) + Math.abs(i - n));
                break;
            }
        }

        System.out.println(min);
    }

    static boolean check(int n, boolean[] buttons) {
        while (n >= 0) {
            if (!buttons[n % 10]) {
                return false;
            }
            n /= 10;

            if (n == 0) break;
        }

        return true;
    }
}
