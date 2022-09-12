import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if (Objects.equals("#", str)) {
                break;
            }
            String s = str.split(" ")[0];

            int n = str.toLowerCase().length() - str.toLowerCase().replace(String.valueOf(s), "").length() - 1;
            
            sb.append(String.format("%s %d\n", s, n));
        }
        bw.append(sb);
        bw.flush();
        bw.close();
    }
}