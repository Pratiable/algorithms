import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        int tc = 1;

        while (true) {
            str = br.readLine();
            if (str.equals("Was it a cat I saw?")) break;
            StringBuilder sb2 = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                sb2.append(str.charAt(i));
                i += tc;
            }

            sb.append(sb2).append("\n");
            tc++;
        }

        System.out.print(sb);
    }
}
