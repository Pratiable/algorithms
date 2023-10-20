import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(st.nextToken()) % 2 == 0) {
                a++;
                continue;
            }
            b++;
        }
        
        System.out.println(a > b ? "Happy" : "Sad");
    }
}