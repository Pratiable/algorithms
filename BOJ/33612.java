import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sy = 2024;
        int sm = 8;
        int months = sy * 12 + (sm - 1) + (n - 1) * 7;

        System.out.printf("%d %d", months / 12, months % 12 + 1);
    }
}