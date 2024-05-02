import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int f = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (st.nextToken().equals("0")) {
                f++;
                continue;
            }
            b++;
        }

        System.out.println(Math.min(f, b));
    }
}