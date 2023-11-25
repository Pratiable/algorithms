import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int B = Integer.parseInt(br.readLine());

        int P = 5 * B - 400;
        int level = Integer.compare(100, P);

        System.out.println(P);
        System.out.println(level);
    }
}
