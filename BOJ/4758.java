import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        while (true) {
            st = new StringTokenizer(br.readLine());
            double sp = Double.parseDouble(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            int str = Integer.parseInt(st.nextToken());
            boolean hasPosition = false;
            
            if (sp == 0 && weight == 0 && str == 0) break;

            if (sp <= 4.5 && weight >= 150 && str >= 200) {
                sb.append("Wide Receiver ");
                hasPosition = true;
            }

            if (sp <= 6.0 && weight >= 300 && str >= 500) {
                sb.append("Lineman ");
                hasPosition = true;
            }

            if (sp <= 5.0 && weight >= 200 && str >= 300) {
                sb.append("Quarterback ");
                hasPosition = true;
            }

            if (!hasPosition) {
                sb.append("No positions");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}