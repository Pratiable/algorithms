import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] suffix = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            suffix[i] = str.substring(i);
        }

        StringBuilder sb = new StringBuilder();
        Arrays.sort(suffix);

        for (int i = 0; i < str.length(); i++) {
            sb.append(suffix[i]).append("\n");
        }

        System.out.println(sb);
    }
}
