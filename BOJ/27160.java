import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int s = 0;
        int b = 0;
        int l = 0;
        int p = 0;
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken();
            int count = Integer.parseInt(st.nextToken());
            
            switch (fruit) {
                case "STRAWBERRY":
                    s += count;
                    break;
                case "BANANA":
                    b += count;
                    break;
                case "LIME":
                    l += count;
                    break;
                case "PLUM":
                    p += count;
                    break;
            }
        }
        
        System.out.println(s == 5 || b == 5 || l == 5|| p == 5 ? "YES" : "NO");
    }
}