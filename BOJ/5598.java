import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int cur = str.charAt(i) - 'A';
            sb.append((char)((cur + 23) % 26 + 'A'));
        }

        System.out.print(sb);
    }
}
