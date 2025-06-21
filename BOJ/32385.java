import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int target = n * (n + 1);
        int start = -10000;
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += start;
            sb.append(start).append(" ");
            start++;
        }
        sb.append(target - sum).append(" ").append(n + 1);
        System.out.println(sb);
    }
}