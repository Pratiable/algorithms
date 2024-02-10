import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double x = Double.parseDouble(st.nextToken());
        double y = Double.parseDouble(st.nextToken());
        double z = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());

        if (x <= a && y <= b && z <= c) {
            System.out.println("A");
        } else if (a >= x / 2 && b >= y && c >= z) {
            System.out.println("B");
        } else if (b >= y && c >= z) {
            System.out.println("C");
        } else if (b >= y / 2 && c >= z) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}
