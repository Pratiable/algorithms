import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int result = 0;
        while (st.hasMoreTokens()) {
            if (Integer.parseInt(st.nextToken()) == n) {
                result++;
            }
        }
        
        System.out.println(result);
    }
}
