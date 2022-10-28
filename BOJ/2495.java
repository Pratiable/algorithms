import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 3; i++) {
            String str = br.readLine();
            int max = 1;
            int now = 1;
            for (int j = 1; j < 8; j++) {
                if (str.charAt(j) == str.charAt(j - 1)) {
                    now++;
                } else {
                    max = Math.max(max, now);
                    now = 1;
                }
            }
            max = Math.max(max, now);
            System.out.println(max);
        }

        bw.flush();
        bw.close();
    }
}
