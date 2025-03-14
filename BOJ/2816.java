import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] channels = new String[n];
        int idx1 = -1;
        int idx2 = -1;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            channels[i] = str;
            if (str.equals("KBS1")) idx1 = i;
            if (str.equals("KBS2")) idx2 = i;
        }

        if (idx1 > idx2) idx2++;

        sb.append("1".repeat(idx1)).append("4".repeat(idx1)).append("1".repeat(idx2)).append("4".repeat(idx2 - 1)).append("\n");

        System.out.println(sb);
    }
}
