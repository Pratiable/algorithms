import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            sb.append((char) Math.max(a[i], b[i]));
        }

        System.out.println(sb);
    }
}
