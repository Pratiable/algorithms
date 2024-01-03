import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        
        System.out.println(n <= 60 + k ? n * 1500 : (60 + k) * 1500 + (n - (60 + k)) * 3000);
    }
}