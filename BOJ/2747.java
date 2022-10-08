import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Integer.parseInt(br.readLine());
        int sum = 2;
        int now = 1;
        int prev = 1;

        if (n == 0) {
            System.out.println(0);
        } else if (n == 1 || n == 2) {
            System.out.println(1);
        } else {
            for (int i = 0; i < n - 2; i++) {
                sum = now + prev;
                prev = now;
                now = sum;
            }
            System.out.println(sum);
        }
    }
}