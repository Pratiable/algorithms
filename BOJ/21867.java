import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();

        for (int i = 0; i < N; i++) {
            char cur = S.charAt(i);
            
            if (cur != 'J' && cur != 'A' && cur != 'V') sb.append(cur);
        }
        
        System.out.print(sb.length() == 0 ? "nojava" : sb);
    }
}
