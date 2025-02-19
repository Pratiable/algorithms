import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int n = str.length();
        
        for (int i = 0; i < n; i++) {
            sb.append(i).append("\n");
        }
        
        System.out.println(sb);
    }
}