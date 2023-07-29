import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        
        int a = A * 7;
        int p = P * 13;
        
        System.out.println(a > p ? "Axel" : a < p ? "Petra" : "lika");
    }
}
