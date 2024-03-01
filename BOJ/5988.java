import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int num = str.charAt(str.length() - 1);
            sb.append(num % 2 == 0 ? "even\n" : "odd\n");
        }

        System.out.println(sb);
    }
}
