import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i+1; j++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
        }
        
        System.out.println(sb);
    }
}
