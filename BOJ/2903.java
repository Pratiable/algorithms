import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        System.out.println((int) Math.pow(((2 * (int) Math.pow(2, n - 1)) + 1), 2));

        bw.flush();
        bw.close();
    }
}
