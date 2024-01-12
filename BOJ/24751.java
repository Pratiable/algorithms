import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(br.readLine());
        double a = 100.0 / n;
        double b = 100.0 / (100.0 - n);

        System.out.println(a);
        System.out.println(b);
    }
}