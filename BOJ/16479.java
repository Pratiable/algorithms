import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double k = Double.parseDouble(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());

        System.out.println(Math.pow(k, 2) - Math.pow((a - b) / 2, 2));
    }
}