import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        while (n > 0) {
            String str = String.valueOf(n);
            Boolean isRight = true;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '4' || str.charAt(i) == '7') {
                    continue;
                }
                isRight = false;
                break;
            }
            if (isRight) {
                System.out.println(n);
                return;
            }
            n--;
        }

        bw.flush();
        bw.close();
    }
}