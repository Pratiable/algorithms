import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        long ans = 1;
        
        for (int i = 1; i < n + 1; i++) {
            ans = ans * i % p;
        }

        System.out.println(ans);
    }
}
