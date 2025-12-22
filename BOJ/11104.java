import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String binary = br.readLine();

            sb.append(Integer.parseInt(binary, 2)).append("\n");
        }

        System.out.print(sb);
    }
}
