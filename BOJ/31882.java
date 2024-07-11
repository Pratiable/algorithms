import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long count = 0;
        long cur = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '2') {
                cur++;
                count += cur * (cur + 1) / 2;
                continue;
            }
            cur = 0;
        }

        System.out.println(count);
    }
}