import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] check = new boolean[1000001];
        int cnt = 1;

        for (int i = 0; i < 3; i++) {
            check[Integer.parseInt(st.nextToken())] = true;
        }

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (!check[a] && !check[b] && !check[c]) {
                cnt++;
            }
            check[a] = true;
            check[b] = true;
            check[c] = true;
        }
        System.out.println(cnt);
    }
}
