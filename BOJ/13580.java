import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        boolean canBack = A == B || A == C || B == C || A == (B + C) || B == (A + C) || C == (A + B);
        
        if (canBack) {
            System.out.println("S");
            return;
        } 
        
        System.out.println("N");
    }
}
