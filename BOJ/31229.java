import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int now = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(now).append(" ");
            now += 2;
        }

        System.out.println(sb);
    }
}
