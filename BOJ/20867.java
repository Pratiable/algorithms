import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double m = Double.parseDouble(st.nextToken());
        double s = Double.parseDouble(st.nextToken());
        double g = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double l = Double.parseDouble(st.nextToken());
        double r = Double.parseDouble(st.nextToken());

        System.out.println(m / g + l / a < m / s + r / b ? "friskus" : "latmask");
    }
}