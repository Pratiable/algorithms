import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] menus = new int[n];
        for (int i = 0; i < n; i++) {
            menus[i] = Integer.parseInt(br.readLine());
        }
        int total = 0;
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            int now = Integer.parseInt(br.readLine());
            total += menus[now - 1];
        }

        System.out.println(total);
    }
}