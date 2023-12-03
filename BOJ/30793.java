import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double p = Integer.parseInt(st.nextToken());
        double r = Integer.parseInt(st.nextToken());

        double v = p / r;

        if (v < 0.2) {
            System.out.println("weak");
        } else if (v < 0.4) {
            System.out.println("normal");
        } else if (v < 0.6) {
            System.out.println("strong");
        } else {
            System.out.println("very strong");
        }
    }
}
