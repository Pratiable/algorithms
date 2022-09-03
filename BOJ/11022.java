import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.append(String.format("Case #%d: %d + %d = %d\n", i, a, b, a + b));
        }

        bw.flush();
        bw.close();
    }
}