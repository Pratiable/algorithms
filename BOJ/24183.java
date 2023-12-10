import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());

        double c4 = 0.229 * 0.324;
        double a3 = 0.297 * 0.420;
        double a4 = 0.210 * 0.297;

        System.out.println(2 * c4 * a + 2 * a3 * b + a4 * c);
    }
}
