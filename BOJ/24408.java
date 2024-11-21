import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        
        for (int i = 1; i < n; i++) {
            int now = Integer.parseInt(br.readLine());
            if (now % a == 0) {
                System.out.println(now);
                a = Integer.parseInt(br.readLine());
                i++;
            }
        }
    }
}