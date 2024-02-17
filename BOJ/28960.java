import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double h = Double.parseDouble(st.nextToken());
        double l = Double.parseDouble(st.nextToken());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());

        if (l < a && l < b) {
            System.out.println("NO");
            return;
        }

        if ((h >= Math.max(a, b) / 2 && Math.min(a, b) <= l) || (h >= Math.min(a, b) / 2 && Math.max(a, b) <= l)){
            System.out.println("YES");
            return;
        }

        System.out.println("NO");
    }
}