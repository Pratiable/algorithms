import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) break;
            
            int parst = 30 * a + 40 * b;
            int parsc = 35 * a + 30 * b;
            int parsp = 40 * a + 20 * b;
            
            int minCost = Math.min(parst, Math.min(parsc, parsp));

            sb.append(minCost).append("\n");
        }

        System.out.println(sb);
    }
}