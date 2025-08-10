import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            if (line.isEmpty()) break;
            int A = Integer.parseInt(line);
            sb.append(A % 6 == 0 ? "Y" : "N").append("\n");
        }

        System.out.println(sb);
    }
}
