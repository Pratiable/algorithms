import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int milk = 0;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int cur = Integer.parseInt(st.nextToken());

            if (cur == milk) {
                cnt++;
                milk = (milk + 1) % 3;
            }
        }

        System.out.print(cnt);
    }
}
