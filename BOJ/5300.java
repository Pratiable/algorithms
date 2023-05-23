import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i <= n; i++) {
            sb.append(i).append(" ");
            
            if(i % 6 == 0 || i == n) {
                sb.append("Go! ");
            }
        }
        
        System.out.println(sb);
    }
}
