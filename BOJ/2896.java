import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        double C = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double I = Double.parseDouble(st.nextToken());
        double J = Double.parseDouble(st.nextToken());
        double K = Double.parseDouble(st.nextToken());

        double min = Math.min(A / I, Math.min(B / J, C / K));
        double a = A - (I * min);
        double b = B - (J * min);
        double c = C - (K * min);

        System.out.print(a == (int) a ? String.valueOf((int) a) : a);
        System.out.print(" ");
        System.out.print(b == (int) b ? String.valueOf((int) b) : b);
        System.out.print(" ");
        System.out.print(c == (int) c ? String.valueOf((int) c) : c);
    }
}
