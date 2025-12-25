import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        String name = "";
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String cur = st.nextToken();
            int gap = Integer.parseInt(st.nextToken());

            if (gap < min) {
                min = gap;
                name = cur;
            }
        }

        System.out.print(name);
    }
}
