import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < n; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            String result = str.substring(0, a) + str.substring(b);
            sb.append(result).append("\n");
        }
        
        System.out.println(sb);
    }
}
