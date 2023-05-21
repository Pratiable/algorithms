import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        
        for (int i = 1; i < n + 1; i++) {
            int lemon = Integer.parseInt(st.nextToken());
            max = Math.max(max, lemon - (n + 1 - i));
        }

        System.out.println(max);
    }
}