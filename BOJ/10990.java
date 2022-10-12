import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.append(" ".repeat(n - 1)).append("*\n");
        for (int i = 0; i < n - 1; i++) {
            bw.append(" ".repeat(n - 2 - i)).append("*").append(" ".repeat((i + 1) * 2 - 1)).append("*\n");
        }
        bw.flush();
        bw.close();
    }
}