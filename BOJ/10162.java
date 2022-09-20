import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        int a = 300;
        int b = 60;
        int c = 10;

        if (t % c == 0) {
            int[] count = new int[]{0, 0, 0};

            if (t / a != 0) {
                count[0] = t / a;
                t %= a;
            }

            if (t / b != 0) {
                count[1] = t / b;
                t %= b;
            }
            count[2] = t / c;

            System.out.printf("%d %d %d", count[0], count[1], count[2]);
        } else {
            System.out.println(-1);
        }
    }
}