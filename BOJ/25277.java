import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            if (str.equals("he") || str.equals("him") || str.equals("she") || str.equals("her")) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}