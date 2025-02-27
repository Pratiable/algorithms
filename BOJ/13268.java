import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int idx = 0;

        Loop:
        while (true) {
            for (int i = 1; i <= 4; i++) {
                if (n < i * 10) {
                    idx = i;
                    break Loop;
                }

                n -= i * 10;
            }
        }

        int remain = n > idx * 5  ? Math.abs(n - idx * 10) : n;

        System.out.println((int) Math.ceil((double) remain / 5));
    }
}