import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] coins = new int[n];
            
            for (int j = 0; j < n; j++) {
                coins[j] = Integer.parseInt(st.nextToken());
            }
            
            sb.append("Denominations: ");
            for (int c : coins) {
                sb.append(c).append(" ");
            }
            sb.append("\n");
            
            boolean isValid = true;
            
            for (int j = 1; j < n; j++) {
                if (coins[j] < 2 * coins[j - 1]) {
                    isValid = false;
                    break;
                }
            }
            
            sb.append(isValid ? "Good coin denominations!\n\n" : "Bad coin denominations!\n\n");
        }
        
        System.out.println(sb);
    }
}
