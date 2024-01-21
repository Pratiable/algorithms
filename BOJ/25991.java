import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double r = 0;
        for (int i = 0; i < n; i++) {
            double side = Double.parseDouble(st.nextToken());
            r += Math.pow(side, 3);
        }

        System.out.println(Math.cbrt(r));
    }
}