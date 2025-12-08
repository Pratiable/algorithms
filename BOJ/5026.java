import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            String q = br.readLine();

            if (q.equals("P=NP")) {
                sb.append("skipped\n");
            } else {
                st = new StringTokenizer(q, "+");

                sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
            }
        }

        System.out.print(sb);
    }
}
