import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int available = Integer.parseInt(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            int now = Integer.parseInt(br.readLine());
            
            available += now - 1;
        }
        System.out.println(available);
    }
}
