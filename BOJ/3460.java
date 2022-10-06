import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String binaryString = Integer.toBinaryString(Integer.parseInt(br.readLine()));
            for (int j = 0; j < binaryString.length(); j++) {
                if (binaryString.charAt((binaryString.length() - 1) - j) == '1') {
                    sb.append(String.format("%d ", j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}