import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        
        while(st.hasMoreElements()) {
            if (Integer.parseInt(st.nextToken()) == n % 10) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}