import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        System.out.print(N * P);
    }
}
