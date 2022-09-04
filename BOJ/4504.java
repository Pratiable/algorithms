import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        while(true) {
            int m = Integer.parseInt(br.readLine());
            if (m == 0) break;
            
            if (m % n == 0) {
                sb.append(String.format("%d is a multiple of %d.\n", m, n));
            } else {
                sb.append(String.format("%d is NOT a multiple of %d.\n", m, n));
            }
        }

        System.out.println(sb);
    }
}