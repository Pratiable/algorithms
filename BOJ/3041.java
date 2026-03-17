import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            str = br.readLine();

            for (int j = 0; j < 4; j++) {
                char cur = str.charAt(j);
                if (cur == '.') continue;

                int idx = cur - 'A';
                int n = idx / 4;
                int m = idx % 4;

                sum += Math.abs(i - n) + Math.abs(j - m);
            }
        }

        System.out.print(sum);
    }
}
