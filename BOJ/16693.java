import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a1 = Double.parseDouble(st.nextToken());
        double p1 = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double r1 = Double.parseDouble(st.nextToken());
        double p2 = Double.parseDouble(st.nextToken());

        double whole = Math.PI * Math.pow(r1, 2) / p2;
        double slice = a1 / p1;

        System.out.println(slice > whole ? "Slice of pizza" : "Whole pizza");
    }
}
