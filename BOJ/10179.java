import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < T; t++) {
            sb.append(String.format("$%.2f\n", Double.parseDouble(br.readLine()) * 0.8));
        }

        System.out.println(sb);
    }
}