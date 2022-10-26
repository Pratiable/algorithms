import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = br.readLine();
            if (str.equals("0")) {
                break;
            }
            while (str.length() != 1) {
                int sum = 0;
                for (int i = 0; i < str.length(); i++) {
                    sum += Integer.parseInt(String.valueOf(str.charAt(i)));
                }
                str = String.valueOf(sum);
            }
            bw.append(str).append("\n");
        }

        bw.flush();
        bw.close();
    }
}