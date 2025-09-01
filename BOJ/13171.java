import java.io.*;
import java.util.*;

public class Main {
    public final static long MOD = 1_000_000_007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long A = Long.parseLong(br.readLine());
        long X = Long.parseLong(br.readLine());

        ArrayList<Long> pows = new ArrayList<>();

        long pow = 1;
        int idx = 1;
        pows.add(1L);
        pows.add(A);

        while (pow * 2 <= X) {
            idx++;
            pows.add(((pows.get(idx - 1) % MOD) * (pows.get(idx - 1) % MOD)) % MOD);
            pow *= 2;
        }

        long ans = 1;

        while (X != 0) {
            if (pow > X) {
                idx--;
                pow /= 2;
                continue;
            }

            ans = ((ans % MOD) * (pows.get(idx) % MOD)) % MOD;
            X -= pow;
        }

        System.out.println(ans);
    }
}