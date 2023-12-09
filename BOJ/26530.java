import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            double sum = 0;
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                int cnt = Integer.parseInt(st.nextToken());
                double price = Double.parseDouble(st.nextToken());

                sum += cnt * price;
            }
            
            sb.append(String.format("$%.2f\n", sum));
        }
        
        System.out.println(sb);
    }
}
