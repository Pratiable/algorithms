import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int x = n % 2 == 0 ? n / 2 + 1 : (n + 1) / 2 + 1;
        int y = n % 2 == 0 ? x : x - 1;
                
        System.out.println(x * y);
    }
}
