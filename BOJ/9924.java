import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 0;

        while (a != b) {
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            a = max - min;
            b = min;
            cnt++;
        }

        System.out.println(cnt);
    }
}
