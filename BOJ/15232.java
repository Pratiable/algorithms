import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < R; i++) {
            sb.append("*".repeat(C)).append("\n");
        }
        System.out.print(sb);
    }
}
