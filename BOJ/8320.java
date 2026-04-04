import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = i; j < n + 1; j++) {
                if (i * j <= n) cnt++;
            }
        }

        System.out.print(cnt);
    }
}
